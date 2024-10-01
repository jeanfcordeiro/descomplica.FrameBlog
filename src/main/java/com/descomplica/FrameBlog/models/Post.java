package com.descomplica.FrameBlog.models;

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratorType;

import java.util.Date;

@Entity
@Table(name = "Post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long postId;
    private String title;
    private String content;
    private Date dade;
    @ManyToOne
    private User userId;

    public Post() {
    }

    public Post(final Long postId, final String title, final String content, final Date dade, final User userId) {
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.dade = dade;
        this.userId = userId;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Date getDade() {
        return dade;
    }

    public void setDade(Date dade) {
        this.dade = dade;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
