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

import com.blogger.website.blogger.service.BlogService;
import com.blogger.website.blogger.entity.Blog;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	
	private final BlogService blogService;
	
	@Autowired
	public BlogController(BlogService blogService) {

		this.blogService = blogService;
	}
	
	@GetMapping("/")
	public List<Blog> findAllBlogs(){
		return blogService.findAllBlogs();
	}
	
	@GetMapping("/{blogId}")
	public Blog findBlog(@PathVariable("blogId") int blogId) {
		return blogService.findBlogById(blogId);
	}
	
	@PostMapping("/")
	public void addBlog(@RequestBody Blog theBlog) {
		theBlog.setId(0);
		blogService.addBlog(theBlog);
	}
	
	@DeleteMapping("/{blogId}")
	public void deleteBlogById(@PathVariable("blogId") int theBlogId) {
		blogService.delteBlogById(theBlogId);
	}
	
	@PutMapping("/")
	public void updateBlog(@RequestBody Blog theBlog) {
		blogService.updateBlog(theBlog);
	}
	

}
