package kr.jhpark.sikdorak.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;

@Getter
@AccessType(AccessType.Type.PROPERTY)
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class PostReview {

    // 포스트 리뷰 idx
    @Id
    private long postReviewIdx;

    // 리뷰 내용
    private String content;

    // 작성자 idx
    private String memberIdx;

    // 조회수
    private String viewCount;

}
