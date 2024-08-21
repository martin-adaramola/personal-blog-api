package com.martinada.personal_blog_api;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PostEntry {
     private String id;
     private String title;
     private String slug;
     private String content;
     private String authorId;
     private LocalDateTime createdAt;
     private LocalDateTime updatedAt;
     private LocalDateTime publishedAt;
     private StatusEnum status;
     private String tags;
     private String categories;


}
