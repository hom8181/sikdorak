package kr.jhpark.sikdorak.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CategoryDto {

    // 업종 idx
    private int categoryIdx;

    // 업종명
    private String name;

}
