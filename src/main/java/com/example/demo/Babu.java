package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Babu {
   @NotNull
   @JsonProperty("fName")
    private String fName;

    @NotNull
    @JsonProperty("lName")
    private String lName;

    @ContactNumberConstraint(message = "ff. valid values are ", enumClass = B.class)
    private String contact;

}

enum B {
    A,B,C
}
