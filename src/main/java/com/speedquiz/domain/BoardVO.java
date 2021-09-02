package com.speedquiz.domain;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class BoardVO {
    private Long bno;
    private String title;
    private String content;
    private String writer;
    private Date regDate;
    private Date updateDate;

    @Builder
    public BoardVO(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

}
