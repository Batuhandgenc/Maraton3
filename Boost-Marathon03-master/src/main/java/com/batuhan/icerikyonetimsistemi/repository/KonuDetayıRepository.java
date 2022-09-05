package com.batuhan.icerikyonetimsistemi.repository;

import com.batuhan.icerikyonetimsistemi.repository.entity.KonuDetayı;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryRepository;

public class KonuDetayıRepository extends MyFactoryRepository<KonuDetayı, Long> {

	public KonuDetayıRepository() {
		super(new KonuDetayı());

	}

}
