package com.kg.librarySpringBoot.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class BookRequest {
    // bookreqid,userid, userid, status (Q/I/R)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookreqid;
    @Column
    private Long userid;
    @Column
    private Long bookid;
    @Column
    private Character status;

    public Long getBookreqid() {
        return bookreqid;
    }

    public void setBookreqid(Long bookreqid) {
        this.bookreqid = bookreqid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return bookreqid + " " + bookid + " " + status + " " + userid;
    }
}