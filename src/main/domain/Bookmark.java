package com.example.demo.domain;

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
public class Bookmark {

    // 즐겨찾기 idx
    @Id
    private long bookmarkIdx;

    // 회원 idx
    private String memberIdx;

    // 식당 id
    private String restaurantIdx;

}
