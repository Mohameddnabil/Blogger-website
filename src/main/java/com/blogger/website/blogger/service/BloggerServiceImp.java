package com.blogger.website.blogger.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blogger.website.blogger.JPA.Repositories.UserRepository;
import com.blogger.website.blogger.entity.User;

@Service
public class BloggerServiceImp implements BloggerService{

	@Autowired
	private UserRepository bloggerRepository;

	public BloggerServiceImp() {

	}

	public BloggerServiceImp(UserRepository blogRepository) {
		this.bloggerRepository = blogRepository;
	}
    
	@Override
	public List<User> findAllBloggers() {

		return bloggerRepository.findAll();
	}
    
	@Override
	public User findBloggerById(int id) {

		return bloggerRepository.findById(id).get();
	}

	@Override
	public void addBlogger(User blogger) {
		bloggerRepository.save(blogger);

	}

	
	@Override
	public void updateBlogger(User blogger) {

		bloggerRepository.save(blogger);
	}

	
	@Override
	public void delteBloggerById(int id) {
		bloggerRepository.deleteById(id);
	}

}
