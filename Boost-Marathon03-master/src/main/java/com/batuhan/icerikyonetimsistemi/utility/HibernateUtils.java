package com.batuhan.icerikyonetimsistemi.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.batuhan.icerikyonetimsistemi.repository.entity.Cevap;
import com.batuhan.icerikyonetimsistemi.repository.entity.Ders;
import com.batuhan.icerikyonetimsistemi.repository.entity.Soru;
import com.batuhan.icerikyonetimsistemi.repository.entity.Konu;
import com.batuhan.icerikyonetimsistemi.repository.entity.KonuDetayı;
import com.batuhan.icerikyonetimsistemi.repository.entity.User;

public class HibernateUtils {

	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
                        configuration.addAnnotatedClass(Cevap.class);
			configuration.addAnnotatedClass(Ders.class);
			configuration.addAnnotatedClass(Soru.class);
			configuration.addAnnotatedClass(Konu.class);
			configuration.addAnnotatedClass(KonuDetayı.class);
			configuration.addAnnotatedClass(User.class);
                        SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();

			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}