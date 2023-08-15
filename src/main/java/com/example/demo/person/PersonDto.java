package com.example.demo.person;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PersonDto {
    @NotNull(message = "name must be have value")
    @Pattern(message = "name must be just letters",regexp = "^[a-zA-Z]+$")
    String name;
    String family;
    String userName;
    String password;
}
