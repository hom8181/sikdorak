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
public class Restaurant {

    // 식당 idx
    @Id
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
