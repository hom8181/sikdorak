package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class BookmarkDirectoryDto {

    // 즐겨찾기 분류 idx
    private long bookmarkDirectoryIdx;

    // 이름
    private String name;

    // 회원idx
    private String memberIdx;

}
