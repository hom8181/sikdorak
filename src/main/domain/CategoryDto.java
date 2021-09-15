package com.example.demo.domain;

import lombok.*;
import org.springframework.data.annotation.Id;

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
