package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RestaurantDto {

    // 식당 idx
    private String restaurantIdx;

    // 이름
    private String name;

    // 업종
    private String category;

    // 위도
    private double latitude;

    // 경도
    private double longitude;

    // 지역화폐 사용 가능 여부
    private boolean localCurrencyAble;

}
