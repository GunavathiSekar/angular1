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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class LikeReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long likeid;
    @Column
    private Long revid;
    @Column
    private Long userid;
    @Column
    private Character likeStatus;
    @Column
    private String comments;

    public void setLikeid(Long likeid) {
        this.likeid = likeid;
    }

    public Long getLikeid() {
        return likeid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getUserid() {
        return userid;
    }

    public Long getRevid() {
        return revid;
    }

    public void setLike(Character likeStatus) {
        this.likeStatus = likeStatus;
    }

    public Character getLike() {
        return likeStatus;
    }

    public void setRevid(Long revid) {
        this.revid = revid;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return likeid + " " + revid + " " + userid + " " + likeStatus +" " +comments;
    }
}