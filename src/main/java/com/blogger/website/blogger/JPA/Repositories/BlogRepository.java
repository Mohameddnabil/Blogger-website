package com.blogger.website.blogger.JPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogger.website.blogger.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
