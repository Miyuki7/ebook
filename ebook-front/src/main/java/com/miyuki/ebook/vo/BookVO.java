package com.miyuki.ebook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.miyuki.ebook.entity.Book;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author miyuki
 */
@Data
public class BookVO extends Book implements Serializable {

    @JsonFormat(timezone = "GMT+8", pattern = "MM/dd HH:mm")
    private Date lastIndexUpdateTime;


}
