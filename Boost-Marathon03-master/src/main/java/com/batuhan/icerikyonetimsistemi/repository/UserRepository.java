package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.User;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class UserRepository extends MyFactoryRepository<User, Long> {

	public UserRepository() {
		super(new User());

	}

}
