package io.goorm.mybatisboard.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostFormDto {

    private String title;
    private String content;

    private Long categoryId;       // 추가
    private String authorName;    // 추가
    private Boolean isNotice;
    private String status;// 추가
}
