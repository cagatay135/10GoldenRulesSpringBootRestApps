package com.example.demo.controller;

import com.example.demo.controller.request.CreatePostRequest;
import com.example.demo.entity.Post;
import com.example.demo.service.PostService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@AllArgsConstructor
public class PostController {

    private final PostService postService;

    @GetMapping("/{id}")
    public Post getPostById(@PathVariable Long id) {
        return postService.getPostById(id);
    }

    @GetMapping()
    public List<Post> getPosts() {
        List<Post> posts = postService.getPosts();
        return posts;
    }

    @PostMapping()
    public Post createPost(@Valid @RequestBody CreatePostRequest request) {
        return postService.createPost(request);
    }
}
