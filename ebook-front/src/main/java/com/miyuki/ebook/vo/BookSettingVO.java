package com.miyuki.ebook.vo;

import com.miyuki.ebook.entity.BookSetting;
import lombok.Data;

import java.io.Serializable;


@Data
public class BookSettingVO extends BookSetting implements Serializable {

    private String bookName;

    private String picUrl;

    private String authorName;

    private String bookDesc;

    private Float score;

    private Integer catId;

    private String catName;

    private Byte bookStatus;


    @Override
    public String toString() {
        return super.toString();
    }
}
