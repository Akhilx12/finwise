package com.finwise.auth.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class RegisterRequest {

    @NotBlank @Email
    private String email;

    @NotBlank @Size(min = 8)
    private String password;

    @Pattern(regexp = "^[0-9]{10}$")
    private String phone;
}