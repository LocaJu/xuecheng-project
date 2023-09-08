package com.xuecheng.media;

import io.minio.*;
import io.minio.messages.DeleteError;
import io.minio.messages.DeleteObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.Resource;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author 77286
 * @version 1.0
 * @description: TODO
 * @date 2023/9/8 15:17
 */

public class MinioTest {
    MinioClient minioClient =
            MinioClient.builder()
                    .endpoint("http://192.168.59.65:9000")
                    .credentials("minioadmin", "minioadmin")
                    .build();

    //将分块文件上传至minio
    @Test
    public void uploadChunk(){
        String chunkFolderPath = "d:/develop/bigfile_test/chunk";

        File chunkFolder = new File(chunkFolderPath);
        //分块文件
        File[] files = chunkFolder.listFiles();
        //将分块文件上传至minio
        for (int i = 0; i < files.length; i++) {
            try {
                UploadObjectArgs uploadObjectArgs = UploadObjectArgs.builder().bucket("testbucket").object("chunk/" + i).filename(files[i].getAbsolutePath()).build();
                minioClient.uploadObject(uploadObjectArgs);
                System.out.println("上传分块成功"+i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //合并文件，要求分块文件最小5M
    @Test
    public void test_merge() throws Exception {


        List<ComposeSource> sources = Stream.iterate(0, i -> ++i)
                .limit(3)
                .map(i -> ComposeSource.builder()
                        .bucket("testbucket")
                        .object("chunk/".concat(Integer.toString(i)))
                        .build())
                .collect(Collectors.toList());



        ComposeObjectArgs composeObjectArgs = ComposeObjectArgs.builder().bucket("testbucket").object("merge01.mp4").sources(sources).build();
        minioClient.composeObject(composeObjectArgs);

    }
    //清除分块文件
    @Test
    public void test_removeObjects(){
        //合并分块完成将分块文件清除
        List<DeleteObject> deleteObjects = Stream.iterate(0, i -> ++i)
                .limit(3)
                .map(i -> new DeleteObject("chunk/".concat(Integer.toString(i))))
                .collect(Collectors.toList());

        RemoveObjectsArgs removeObjectsArgs = RemoveObjectsArgs.builder().bucket("testbucket").objects(deleteObjects).build();
        Iterable<Result<DeleteError>> results = minioClient.removeObjects(removeObjectsArgs);
        results.forEach(r->{
            DeleteError deleteError = null;
            try {
                deleteError = r.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

}
