package com.flytxt.hibernate;

import org.hibernate.Session;

public class EmployeeDAO {
	
	public Session createSession() {
		 return HibernateUtil.getSessionFactory().openSession();
	}
	
	public int empSave(EmployeeEntity emp) {
		try {
			Session session=createSession();
			session.beginTransaction();
			session.save(emp);
			session.getTransaction().commit();
			session.close();
			return 1;
		}catch (Exception e) {
			System.out.println("Error Occured::"+e);
			return 0;
		}
	}
	
	
}
