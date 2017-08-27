package com.andrzej.bloggingPlatform.service;

import com.andrzej.bloggingPlatform.entities.BlogPost;
import com.andrzej.bloggingPlatform.repositories.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by andrzej on 27.08.17.
 */

@Service
public class BlogPostService {

	@Autowired
	private BlogPostRepository blogPostRepository;

	public List<BlogPost> getAllPost() {
		return blogPostRepository.findAll();
	}

	public void insert(BlogPost blogPost) {
		 blogPostRepository.save(blogPost);
	}
}
