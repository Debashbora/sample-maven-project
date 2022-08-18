package com.sevya.carmodeldata.util;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component
public class DaoUtil {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	
	public Session getSession() {
		return hibernateTemplate.getSessionFactory().openSession();
	}
	
	public Transaction getTransaction(Session session) {
		return session.beginTransaction();
	}
	
}
