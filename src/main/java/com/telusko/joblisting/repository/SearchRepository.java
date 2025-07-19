package com.telusko.joblisting.repository;

import com.telusko.joblisting.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public interface SearchRepository {

    List<Post> findByText(String text);
}
