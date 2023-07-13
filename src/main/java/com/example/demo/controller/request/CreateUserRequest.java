package com.example.demo.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CreateUserRequest {
    private Long id;

    private String name;
    private String surname;
    private String email;
    @NotNull
    private String phone;
}
