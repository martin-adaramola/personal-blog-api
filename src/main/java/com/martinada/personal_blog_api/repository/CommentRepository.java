package com.martinada.personal_blog_api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<CommentRepository, String> {
}
