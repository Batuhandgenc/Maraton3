package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.CevapRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.Cevap;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class CevapService extends MyFactoryService<CevapRepository, Cevap, Long> {

	public CevapService() {
		super(new CevapRepository());

	}

}
