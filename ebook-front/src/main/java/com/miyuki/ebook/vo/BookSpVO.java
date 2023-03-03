package com.miyuki.ebook.vo;

import lombok.Data;

import java.util.Date;

/**
 * 小说搜索参数
 * @author miyuki
 */
@Data
public class BookSpVO {

    private String keyword;

    private Byte workDirection;

    private Integer catId;

    private Byte isVip;

    private Byte bookStatus;

    private Integer wordCountMin;

    private Integer wordCountMax;

    private Date updateTimeMin;

    private Long updatePeriod;

    private String sort;

}
