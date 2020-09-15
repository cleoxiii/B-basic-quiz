package com.thoughtworks.gtb.basicquiz.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long id;

    @NotNull
    @Length(min = 1, max = 128)
    private String name;

    @NotNull
    @Min(17)
    private long age;

    @NotNull
    @Length(min = 8, max = 512)
    private String avatar;

    @Length(max = 1024)
    private String description;
}
