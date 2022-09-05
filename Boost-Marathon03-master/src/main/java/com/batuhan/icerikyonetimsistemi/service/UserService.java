package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.UserRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.User;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class UserService extends MyFactoryService<UserRepository, User, Long> {

	public UserService() {
		super(new UserRepository());

	}

}
