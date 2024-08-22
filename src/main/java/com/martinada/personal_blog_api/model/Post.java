package com.martinada.personal_blog_api.model;

import com.martinada.personal_blog_api.utils.StatusEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Post {
     @Id
     private String id;
     private String title;
     private String slug;
     private String content;
     private String userId;
     private LocalDateTime createdAt;
     private LocalDateTime updatedAt;
     private LocalDateTime publishedAt;
     private StatusEnum status;
     private List<String> tags;
     private String categories;
}
