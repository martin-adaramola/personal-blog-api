package com.martinada.personal_blog_api.model;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class User {
    private String id;
    @Indexed(unique = true)
    private String username;
    private String firstName;
    private String lastName;
    @Indexed(unique = true)
    private String email;
    private Address address;

    public User(String username, String firstName, String lastName, String email, Address address) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
    }
}
