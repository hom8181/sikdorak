package com.example.demo.domain;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends PagingAndSortingRepository<Member, String> {

    List<Member> findAll();

    Optional<Member> findByGender(char gender);

    @Query("select * " +
            "from member mb " +
            "left join review rv " +
            "   on mb.member_idx = rv.member_idx" +
            "       where mb.member_idx = :memberIdx ")
    Optional<Member> findMemberReview(String memberIdx);

}
