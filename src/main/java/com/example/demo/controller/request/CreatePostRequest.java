package com.example.demo.controller.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class CreatePostRequest {
    private Long id;

    @NotNull
    @Size(min = 1, max = 50 , message = "Title must be between 1 and 50 characters")
    private String title;
    private String content;
    private LocalDateTime createdAt;
}
