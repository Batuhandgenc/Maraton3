package com.batuhan.icerikyonetimsistemi.service;

import com.batuhan.icerikyonetimsistemi.repository.SoruRepository;
import com.batuhan.icerikyonetimsistemi.repository.entity.Soru;
import com.batuhan.icerikyonetimsistemi.utility.MyFactoryService;

public class SoruService extends MyFactoryService<SoruRepository, Soru, Long> {

	public SoruService() {
		super(new SoruRepository());

	}

}
