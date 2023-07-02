package com.blogger.website.blogger.service;

import java.util.List;

import com.blogger.website.blogger.entity.User;

public interface BloggerService {
	public List<User> findAllBloggers();

	public User findBloggerById(int id);

	public void addBlogger(User blogger);

	public void updateBlogger(User blogger);

	public void delteBloggerById(int id);
}
