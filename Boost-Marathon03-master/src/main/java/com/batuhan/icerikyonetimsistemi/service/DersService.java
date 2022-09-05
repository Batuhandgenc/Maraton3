package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.DersRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.Ders;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class DersService extends MyFactoryService<DersRepository, Ders, Long> {

	public DersService() {
		super(new DersRepository());

	}

}
