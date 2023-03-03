package com.miyuki.ebook.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author miyuki
 */
@Data
@Component
@ConfigurationProperties(prefix="website")
public class WebsiteProperties {

    private String name;
    private String domain;
    private String keyword;
    private String description;
    private String qq;
}
