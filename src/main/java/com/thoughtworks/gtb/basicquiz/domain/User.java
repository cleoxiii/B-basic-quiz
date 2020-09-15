package com.thoughtworks.gtb.basicquiz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;
    private String name;
    private long age;
    private String avatar;
    private String description;
}
