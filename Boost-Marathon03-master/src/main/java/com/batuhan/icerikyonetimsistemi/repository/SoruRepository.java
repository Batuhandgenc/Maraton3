package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.Soru;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class SoruRepository extends MyFactoryRepository<Soru, Long> {

	public SoruRepository() {
		super(new Soru());

	}

}
