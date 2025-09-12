package io.goorm.mybatisboard.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostWithDetailsDto {
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String status;
    private String authorName;
    private int viewCount;
    private boolean isNotice;
    private int categoryId;
    private String categoryName;
}
