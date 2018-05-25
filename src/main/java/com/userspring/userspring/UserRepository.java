package com.userspring.userspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.userspring.userspring.User;


public interface UserRepository extends CrudRepository<User, Long> {
	
	
	
}
