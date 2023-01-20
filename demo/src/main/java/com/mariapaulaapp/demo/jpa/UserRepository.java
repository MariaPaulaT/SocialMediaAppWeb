package com.mariapaulaapp.demo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mariapaulaapp.demo.user.*;

//use the user repository to talk to the database +
public interface UserRepository extends JpaRepository<User, Integer> {

}
