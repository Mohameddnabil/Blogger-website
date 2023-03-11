package com.blogger.website.blogger.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogger.website.blogger.entity.User;
import com.blogger.website.blogger.service.BloggerService;

@RestController
@RequestMapping("/api")
public class BloggerController {
	private BloggerService bloggerService;

	@Autowired
	public BloggerController(BloggerService bloggerService) {

		this.bloggerService = bloggerService;

	}

	@GetMapping("/bloggers")
	public List<User> findAll() {
		return bloggerService.findAll();
	}

	@GetMapping("/bloggers/{bloggerId}")
	public User getBlogger(@PathVariable("bloggerId") int theId) {
		
		return bloggerService.findById(theId);
		
	}

	@PostMapping("/bloggers")
	public void addBlogger(@RequestBody User blogger) {

		blogger.setId(0);
		bloggerService.addBlogger(blogger);

	}
    
	@DeleteMapping("/bloggers/{bloggerId}")
	public void deleteBlogger(@PathVariable("bloggerId") int theId) {
		
		bloggerService.delteBloggerById(theId);
		
	}
	
	@PutMapping("/bloggers")
	public void updateBlogger(@RequestBody User blogger) {
		
		bloggerService.updateBlogger(blogger);
	}
}
