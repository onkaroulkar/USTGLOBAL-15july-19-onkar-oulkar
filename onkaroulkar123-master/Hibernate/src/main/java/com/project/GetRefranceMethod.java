package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetRefranceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();

			Student st = entityManager.getReference(Student.class, 200);
			st.setUsername("shubham");
			System.out.println("data updated Succsessfully");
			transaction.commit();

		} catch (Exception e) {

			entityManager.close();
			e.printStackTrace();
		}
	}

}
