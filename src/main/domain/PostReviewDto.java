package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostReviewDto {

    // 포스트 리뷰 idx
    private long postReviewIdx;

    // 리뷰 내용
    private String content;

    // 작성자 idx
    private String memberIdx;

    // 조회수
    private String viewCount;

}
