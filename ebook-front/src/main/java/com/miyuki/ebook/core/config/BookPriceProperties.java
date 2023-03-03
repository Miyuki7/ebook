package com.miyuki.ebook.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 章节费用配置属性
 * @author miyuki
 */
@Component
@Data
@ConfigurationProperties(prefix = "book.price")
public class BookPriceProperties {

    private BigDecimal wordCount;

    private BigDecimal value;
}
