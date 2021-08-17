package com.User.com.user.Service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.stereotype.Service;

import com.User.com.user.Entity.User;
@Service
public class UserServiceImpl implements UserService{
	
	List<User> list=List.of(
			new User(101L,"Basil","9748561230"),
			new User(102L,"Ansil","9744859674"),
			new User(103L,"Bincy","8859746123")
			
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user -> user.getUser_id().equals(id)).findAny().orElse(null);
	}
}
