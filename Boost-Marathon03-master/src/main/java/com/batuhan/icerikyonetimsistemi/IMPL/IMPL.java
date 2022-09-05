package com.batuhan.icerikyonetimsistemi.IMPL;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;

import com.batuhan.icerikyonetimsistemi.repository.entity.Cevap;
import com.batuhan.icerikyonetimsistemi.repository.entity.UserDetail;
import com.batuhan.icerikyonetimsistemi.repository.entity.Ders;
import com.batuhan.icerikyonetimsistemi.repository.entity.Soru;
import com.batuhan.icerikyonetimsistemi.repository.entity.Konu;
import com.batuhan.icerikyonetimsistemi.repository.entity.KonuDetayı;
import com.batuhan.icerikyonetimsistemi.repository.entity.User;
import com.batuhan.icerikyonetimsistemi.service.CevapService;
import com.batuhan.icerikyonetimsistemi.service.DersService;
import com.batuhan.icerikyonetimsistemi.service.SoruService;
import com.batuhan.icerikyonetimsistemi.service.KonuDetayıService;
import com.batuhan.icerikyonetimsistemi.service.KonuService;
import com.batuhan.icerikyonetimsistemi.service.UserService;
import com.batuhan.icerikyonetimsistemi.utility.HibernateUtils;

public class IMPL {

	private static Session session;
        private static CevapService answersService;
        private static UserService userService;
	private static org.hibernate.Transaction transaction;
        private static SoruService questionsService;
	private static EntityManager entityManager;
        private static KonuService subjectService;
        private static KonuDetayıService subjectDetailService;
	private static CriteriaBuilder criteriabuilder;
	private static DersService lessonService;

	public IMPL() {
		super();
                userService = new UserService();
		entityManager = HibernateUtils.getSessionFactory().createEntityManager();
		criteriabuilder = entityManager.getCriteriaBuilder();
		answersService = new CevapService();
		lessonService = new DersService();
		questionsService = new SoruService();
		subjectService = new KonuService();
		subjectDetailService = new KonuDetayıService();
	}

	public static void startDataIMPL() throws InterruptedException {
		User user01 = new User("Batuhan", "Genc", UserDetail.EDITOR, new Date(), new Date());
		User user02 = new User("Halit", "Kahya", UserDetail.EDITOR, new Date(), new Date());
		User user03 = new User("Efe", "Yıldı", UserDetail.USER, new Date(), new Date());
		User user04 = new User("Satılmıs", "Kerem", UserDetail.USER, new Date(), new Date());
		User user05 = new User("Talat", "Gündoğdu", UserDetail.USER, new Date(), new Date());
                userService.save(user01);
		userService.save(user02);
		userService.save(user03);
                Ders lesson01 = new Ders("Java", "İleri Seviye", new Date(), new Date());
		Ders lesson02 = new Ders("PHP", "OldSchoolBoy", new Date(), new Date());
		Konu subject01 = new Konu("Linux Sızma", lesson02, new Date(), new Date());
		Konu subject03 = new Konu("MIM(Man In the Middle)", lesson01, new Date(), new Date());
		Konu subject02 = new Konu("RFI LFI", lesson01, new Date(), new Date());
		KonuDetayı subjectDetail01 = new KonuDetayı(subject03, user01, "asfasf", "asfasassd",
				"Java", new Date(), new Date());
		KonuDetayı subjectDetail02 = new KonuDetayı(subject02, user01, "asfasfxv",
				"asfasfas", "Java", new Date(), new Date());
		KonuDetayı subjectDetail03 = new KonuDetayı(subject01, user01, "asfasfa", "asfasfasgas",
				"Java", new Date(), new Date());
                subjectDetailService.save(subjectDetail01);
		subjectDetailService.save(subjectDetail02);
		subjectDetailService.save(subjectDetail03);
		Soru Q1 = new Soru(subjectDetail01, user04, "Q1", "i love stackoverflow", new Date(),
		new Date());
		Soru Q2 = new Soru(subjectDetail02, user05, "Q2", "Some learn keywords", new Date(),
		new Date());
		Soru Q3 = new Soru(subjectDetail03, user04, "Q3", "what am i do",
		new Date(), new Date());
		questionsService.save(Q1);
		questionsService.save(Q2);
		questionsService.save(Q3);
		Cevap answer01 = new Cevap(Q1, user01, "what the java", new Date(), new Date());
		Cevap answer02 = new Cevap(Q2, user01, "dude learn that", new Date(), new Date());
		Cevap answer03 = new Cevap(Q3, user02, "maybe start how can found this", new Date(), new Date());
                answersService.save(answer01);
		answersService.save(answer02);
		answersService.save(answer03);


	}

}
