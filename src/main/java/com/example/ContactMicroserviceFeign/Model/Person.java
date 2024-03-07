package com.example.ContactMicroserviceFeign.Model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Person {

    private String name;
    private String email;
    private int age;

}
