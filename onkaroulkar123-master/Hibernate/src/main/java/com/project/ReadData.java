package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ReadData {

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


			st.setUsername("rohan");

			System.out.println(st.getId());
			System.out.println(st.getUsername());
			System.out.println(st.getPassword());

		} catch (Exception e) {

			entityManager.close();
			e.printStackTrace();
		}
	}

}
