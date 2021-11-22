package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class PostRepository {
    public List<Post> findAll() {
        return new ArrayList<>();
    }

    public List<Post> saveAll(List<Post> posts) {
        return new ArrayList<>();
    }

    public Post save(Post post) {
        return null;
    }

    public Optional<Post> findById(Long id) {
        return null;
    }

    public List<Post> findByTitleContaining(String title) {
        return new ArrayList<>();
    }
}