package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.KonuDetayıRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.KonuDetayı;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class KonuDetayıService extends MyFactoryService<KonuDetayıRepository, KonuDetayı, Long> {

	public KonuDetayıService() {
		super(new KonuDetayıRepository());

	}

}
