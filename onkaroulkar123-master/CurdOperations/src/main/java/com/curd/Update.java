package com.curd;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityTransaction transaction = null;
		EntityManager entityManager = null;

		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			Laptop lap = entityManager.find(Laptop.class, "hp");
			lap.setName("acer");
			System.out.println("update...");
			transaction.commit();

		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
	}

}
