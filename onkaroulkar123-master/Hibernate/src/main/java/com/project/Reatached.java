package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Reatached {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager = null;
		@SuppressWarnings("unused")
		EntityTransaction transaction = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			Student st = entityManager.find(Student.class, 200);

			System.out.println(entityManager.contains(st));
			entityManager.detach(st);
			System.out.println(entityManager.contains(st));
			st.setUsername("shubham");
		    Student st1= entityManager.merge(st);
			

			

			System.out.println(st1.getId());
			System.out.println(st1.getUsername());
			System.out.println(st1.getPassword());

		} catch (Exception e) {

			entityManager.close();
			e.printStackTrace();
		}
	}

}
