package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookmarkDto {

    // 즐겨찾기 idx
    private long bookmarkIdx;

    // 회원 idx
    private String memberIdx;

    // 식당 id
    private String restaurantIdx;

}
