package com.check.hib.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static{
		try{
			AnnotationConfiguration annotationConfiguration = new AnnotationConfiguration();
			sessionFactory = annotationConfiguration.configure().buildSessionFactory();
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public static void shutdown(){
		getSessionFactory().close();
	}
	
}
