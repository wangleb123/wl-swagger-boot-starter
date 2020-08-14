package com.lexiang.swagger.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    //需扫描包路径
    private String packages;

    //文档标题
    private String apiTittle;

    //文档描述
    private String apiDes;

    private String serviceUrl;

    private String writerName;

    private String version;

    private String type;


}
