package com.vatsalrajgor.socialmediaplatform.models;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "profiles")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long profileId;

    private String gender;

    private String dateOfBirth;

    private String address;

    private String city;

    private String state;

    private String country;

    private String pincode;

    private String profileImageUrl;  // If storing image path or URL

    private String jobTitle;

    private String bio;

    @OneToOne(mappedBy = "profile")
    private User user;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}
