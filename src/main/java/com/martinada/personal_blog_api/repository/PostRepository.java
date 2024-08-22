package com.martinada.personal_blog_api.repository;

import com.martinada.personal_blog_api.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository
        extends MongoRepository<Post, String> {
}
