package com.curd;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read {

	public static void main(String[] args) {

		EntityManager entityManager = null;

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		entityManager = entityManagerFactory.createEntityManager();

		Laptop lap = entityManager.find(Laptop.class, "hp");
		System.out.println(lap.getColor());
		System.out.println(lap.getName());
		System.out.println(lap.getPrice());
		System.out.println(lap.getRam());

		entityManager.close();
	}

}
