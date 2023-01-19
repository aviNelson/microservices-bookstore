package com.avinelson.backenduser.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AuthorDto implements Serializable {

    private String firstname;
    private String lastname;
}
