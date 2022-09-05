package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.KonuRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.Konu;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class KonuService extends MyFactoryService<KonuRepository, Konu, Long> {

	public KonuService() {
		super(new KonuRepository());

	}

}
