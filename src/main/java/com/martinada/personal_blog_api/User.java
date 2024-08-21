package com.martinada.personal_blog_api;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private Address address;
}
