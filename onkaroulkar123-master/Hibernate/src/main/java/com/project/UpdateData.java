package com.project;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();

			transaction.begin();
			Student st = entityManager.find(Student.class, 230);
		//	Student st = entityManager.getReference(Student.class, 201);
		//	st.setUsername("shubham");
			//System.out.println("data updated Successfully");
			System.out.println(st.getId());
			transaction.commit();

		} catch (Exception e) {

			entityManager.close();
			e.printStackTrace();
		}
	}

}
