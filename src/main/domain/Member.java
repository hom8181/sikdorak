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
public class Member extends EntityExtension {

    // 회원 IDX
    @Id
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
