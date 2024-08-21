package com.martinada.personal_blog_api;

import lombok.Data;

@Data
public class Address {
    private String address1;
    private String address2;
    private String city;
    private String country;
    private String postcode;
}
