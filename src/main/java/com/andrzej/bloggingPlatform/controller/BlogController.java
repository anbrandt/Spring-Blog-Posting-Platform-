package com.andrzej.bloggingPlatform.controller;

import com.andrzej.bloggingPlatform.entities.BlogPost;
import com.andrzej.bloggingPlatform.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BlogController {

	@Autowired
	private BlogPostService postService;


	public BlogController(){

	}

	@RequestMapping("/")
	public String start() {
		return "start";
	}


	@GetMapping(value = "/posts")
	public List<BlogPost> getAllPosts() {
		return postService.getAllPost();
	}


	@PostMapping(value = "/post")
	public void publishPosts(@RequestBody BlogPost blogPost) {
		if(blogPost.getDateCreated() == 	(null))
			blogPost.setDateCreated(new Date());

		postService.insert(blogPost);
	}



}
