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
public class BookmarkDirectory {

    // 즐겨찾기 분류 idx
    @Id
    private long bookmarkDirectoryIdx;

    // 이름
    private String name;

    // 회원idx
    private String memberIdx;

}
