package com.kg.librarySpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.kg.librarySpringBoot.model.BookReview;;

@Repository
public interface BookReviewRepository extends JpaRepository<BookReview, Long>
{
    @Query(value="select a.USERID,a.BOOKREVID,a.BOOKID,a.REVIEW,b.LIKEID,b.LIKESTATUS from BOOKREVIEW a join LIKEREVIEW b on a.USERID=b.USERID where a.USERID=:user_id",nativeQuery=true)
    Iterable<BookReview> findbyreviewId(@Param("user_id") Long user_id);

}