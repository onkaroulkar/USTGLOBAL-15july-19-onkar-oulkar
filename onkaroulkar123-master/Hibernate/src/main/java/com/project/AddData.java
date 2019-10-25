package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();
        st.setId(100);
        st.setUsername("shubham");
        st.setPassword("shubham");
        
        
		
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			transaction.begin();
			entityManager.persist(st);
			System.out.println("entry done");
			transaction.commit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			entityManager.close();
			e.printStackTrace();
		}

	}

}
