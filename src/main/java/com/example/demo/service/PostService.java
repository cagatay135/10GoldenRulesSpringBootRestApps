package com.example.demo.service;

import com.example.demo.controller.request.CreatePostRequest;
import com.example.demo.entity.Post;
import com.example.demo.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post getPostById(Long id) {
        return postRepository.findById(id).orElse(null);
    }

    @Cacheable("posts")
    public List<Post> getPosts() {
        List<Post> posts = postRepository.findAll();
        return posts;
    }

    public Post createPost(CreatePostRequest request) {
        Post post = Post.builder()
                .title(request.getTitle())
                .content(request.getContent())
                .build();
        return  postRepository.save(post);
    }
}
