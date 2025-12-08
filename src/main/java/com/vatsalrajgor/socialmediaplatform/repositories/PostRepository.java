package com.vatsalrajgor.socialmediaplatform.repositories;

import com.vatsalrajgor.socialmediaplatform.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
