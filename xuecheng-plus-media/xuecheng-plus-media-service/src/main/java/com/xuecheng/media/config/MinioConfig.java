package com.xuecheng.media.config;

import io.minio.MinioClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 77286
 * @version 1.0
 * @description: TODO
 * @date 2023/9/7 22:06
 */
@Configuration
public class MinioConfig {

  @Value("${minio.endpoint}")
  private String endpoint;
  @Value("${minio.accessKey}")
  private String accessKey;
  @Value("${minio.secretKey}")
  private String secretKey;


  @Bean
  public MinioClient minioClient(){
    return MinioClient.builder()
            .endpoint(endpoint)
            .credentials(accessKey,secretKey)
            .build();
  }
}
