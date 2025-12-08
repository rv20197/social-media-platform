package com.vatsalrajgor.socialmediaplatform.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="posts")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;

    private String content;

    private String author;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    @ManyToOne()
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    @PrePersist
    protected void onCreate () {
        createdAt = LocalDateTime.now();
        updatedAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate () {
        updatedAt = LocalDateTime.now();
    }
}
