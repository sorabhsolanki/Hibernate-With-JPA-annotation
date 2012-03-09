package com.check.hib.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.check.hib.dto.Message;

public class TestApp {

	public static void main(String...strings){
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Message message = new Message();
		message.setId((long)2);
		message.setMessageText("solanki");
		session.save(message);
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
	}
}
