package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.Ders;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class DersRepository extends MyFactoryRepository<Ders, Long> {

	public DersRepository() {
		super(new Ders());

	}

}
