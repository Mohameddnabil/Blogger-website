package com.blogger.website.blogger.service;

import java.util.List;

import com.blogger.website.blogger.entity.Blog;

public interface BlogService {
	public List<Blog> findAllBlogs();

	public Blog findBlogById(int id);

	public void addBlog(Blog blogger);

	public void updateBlog(Blog blogger);

	public void delteBlogById(int id);
}
