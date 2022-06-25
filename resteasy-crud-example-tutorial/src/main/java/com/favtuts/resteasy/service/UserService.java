package com.favtuts.resteasy.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.NotFoundException;

import com.favtuts.resteasy.model.User;

public class UserService {

	private static List<User> users = new ArrayList<User>();

	public List<User> findAll() {
		if (users.size() <= 0) {
			users.add(new User(100L, "Ramesh", "ramesh@gmail.com"));
			users.add(new User(101L, "Tony", "tony@gmail.com"));
			users.add(new User(102L, "Tom", "tom@gmail.com"));
		}
		return users;
	}

	public User fetchBy(long id) throws NotFoundException {
		for (User user : findAll()) {
			if (id == user.getId()) {
				return user;
			} else {
				throw new NotFoundException("Resource not found with Id :: " + id);
			}
		}
		return null;
	}

	public boolean create(User newUser) {
		for (User user : users) {
			if (user.getId().equals(newUser.getId())) {
				return false;
			}
		}
		return users.add(newUser);
	}

	public boolean update(User updateUser) {
		for (User user : users) {
			if (user.getId().equals(updateUser.getId())) {
				users.remove(user);
				users.add(updateUser);
				return true;
			}
		}
		return false;
	}

	public boolean delete(Long id) throws NotFoundException {
		for (User user : users) {
			if (user.getId().equals(id)) {
				users.remove(user);
				return true;
			}
		}
		return false;
	}
}
