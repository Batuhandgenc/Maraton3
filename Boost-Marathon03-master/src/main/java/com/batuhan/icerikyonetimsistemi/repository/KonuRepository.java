package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.Konu;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class KonuRepository extends MyFactoryRepository<Konu, Long> {

	public KonuRepository() {
		super(new Konu());

	}

}
