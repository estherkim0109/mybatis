package io.goorm.mybatisboard.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {
    
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Long categoryId;       // 추가
    private String authorName;    // 추가
    private Boolean isNotice;
    private String status;// 추가
    private int viewCount;
}