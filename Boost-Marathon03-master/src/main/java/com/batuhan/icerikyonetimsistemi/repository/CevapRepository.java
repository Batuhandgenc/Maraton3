package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.Cevap;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class CevapRepository extends MyFactoryRepository<Cevap, Long> {

	public CevapRepository() {
		super(new Cevap());

	}

}
