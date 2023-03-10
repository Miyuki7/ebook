package com.miyuki.ebook.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component
@ConfigurationProperties(prefix = "http.proxy")
public class HttpProxyProperties {

    private Boolean enabled;

    private String ip;

    private Integer port;

}
