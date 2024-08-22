package com.martinada.personal_blog_api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String postcode;
}
