package com.example.dscommerce.services;

import com.example.dscommerce.entities.User;
import com.example.dscommerce.services.exceptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AuthService {

	@Autowired
	private UserService userService;
	
	public void validateSelfOrAdmin(Long userId) {
		User me = userService.authenticated();
		if (me.hasRole("ROLE_ADMIN")){
			return;
		}
		if(!me.getId().equals(userId)){
			throw new ForbiddenException("Access denied. Should be self or admin");
		}

	}
}
