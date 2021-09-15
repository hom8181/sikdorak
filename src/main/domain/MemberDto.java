package com.example.demo.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MemberDto {

    // 회원 IDX
    private String memberIdx;

    // 이메일
    private String email;

    // 비밀번호
    private String password;

    // 이름
    private String name;

    // 성별
    private String gender;

    // 생년월일
    private int birth;

}
