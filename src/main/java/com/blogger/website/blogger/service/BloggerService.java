package com.blogger.website.blogger.service;

import java.util.List;

import com.blogger.website.blogger.entity.User;

public interface BloggerService {
	public List<User> findAll();

	public User findById(int id);

	public void addBlogger(User blogger);

	public void updateBlogger(User blogger);

	public void delteBloggerById(int id);
}
