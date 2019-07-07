package com.finedjentleman.routinetracker.services;

import com.finedjentleman.routinetracker.models.User;

public interface UserService {

	void addUser(User user);

	User getUser(Long userId);

	void deleteUser(Long userId);

}