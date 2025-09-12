package io.goorm.mybatisboard.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostListDto {
    
    private Long id;
    private String title;
    private LocalDateTime createdAt;
    private Long categoryId;       // 추가
    private String authorName;    // 추가
    private Boolean isNotice;
    private String status;// 추가
    private int viewCount;
    private String categoryName;
}