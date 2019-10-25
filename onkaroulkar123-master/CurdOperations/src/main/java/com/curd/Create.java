package com.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Create {

	public static void main(String[] args) {
		
		Laptop lap = new Laptop();
		lap.setName("xyz");
		lap.setColor("black");
		lap.setPrice(30000);
		lap.setRam(4);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");// provid
		// all

		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(lap);
			System.out.println("saved");
			transaction.commit();// if we not write transaction.commite() then object is not saved in database

		} catch (Exception e) {

			transaction.rollback();
			e.printStackTrace();

		} finally {
			entityManager.close();
		}

	}

}
