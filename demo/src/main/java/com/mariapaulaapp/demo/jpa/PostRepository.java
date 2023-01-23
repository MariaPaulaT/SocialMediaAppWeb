package com.mariapaulaapp.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mariapaulaapp.demo.user.Post;
public interface PostRepository extends JpaRepository<Post, Integer> {

}
