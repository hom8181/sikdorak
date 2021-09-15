package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ReviewDto {

    // 후기 idx
    private long reviewIdx;

    // 멤버 idx
    private String memberIdx;

    // 식당 idx
    private String restaurantIdx;

    // 평점
    private String ratingIdx;

    // 리뷰어 생년월일
    private int reviewerBirth;

    // 리뷰어 성별
    private String reviewerGender;

    // 사진 1
    private String photo1;

    // 사진 2
    private String photo2;

    // 사진 3
    private String photo3;

}
