package com.blogger.website.blogger.JPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogger.website.blogger.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
