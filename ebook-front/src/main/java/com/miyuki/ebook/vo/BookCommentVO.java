package com.miyuki.ebook.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.miyuki.ebook.core.serialize.CommentUserNameSerialize;
import com.miyuki.ebook.entity.BookComment;
import lombok.Data;

import java.util.Date;

@Data
public class BookCommentVO extends BookComment {

    @JsonSerialize(using = CommentUserNameSerialize.class)
    private String createUserName;

    private String createUserPhoto;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Override
    public String toString() {
        return super.toString();
    }
}
