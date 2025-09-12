package io.goorm.mybatisboard.dto;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Accessors(fluent = false) // 기본, getIsNotice() 호출 가능
public class PostDetailDto {

    private String title;
    private String content;
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;   // 수정일
    private Long categoryId;            // 카테고리 ID
    private String authorName;         // 작성자 이름
    private Boolean isNotice;          // 공지 여부
    private String status;
    private String categoryName;
    private int viewCount;
}
