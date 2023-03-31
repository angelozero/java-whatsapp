package com.angelozero.javawhatsapp.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class MessageConfiguration {

    @Value("${ultra_msg.token}")
    private String token;

    @Value("${ultra_msg.url}")
    private String url;

    @Value("${ultra_msg.instance_id}")
    private String instanceId;

    @Value("${ultra_msg.path}")
    private String path;
}
