package com.blogger.website.blogger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.website.blogger.JPA.Repositories.BlogRepository;
import com.blogger.website.blogger.entity.Blog;

@Service
public class BlogServiceImpl implements BlogService {
    
	@Autowired
	BlogRepository blogRepository;

	@Override
	public List<Blog> findAllBlogs() {
		return blogRepository.findAll();
	}

	@Override
	public Blog findBlogById(int blogId) {
		return blogRepository.findById(blogId).get();
	}

	@Override
	public void addBlog(Blog blog) {
		blogRepository.save(blog);
		
	}

	@Override
	public void updateBlog(Blog blog) {
		blogRepository.save(blog);
		
	}

	@Override
	public void delteBlogById(int blogId) {
		blogRepository.deleteById(blogId);
		
	}
	

}
