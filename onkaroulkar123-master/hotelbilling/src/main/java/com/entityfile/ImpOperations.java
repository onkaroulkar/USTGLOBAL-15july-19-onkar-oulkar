package com.entityfile;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class ImpOperations implements Operations {

	Scanner sc=new Scanner(System.in);
	@Override
	public void add() {
		HotelBill b1=new HotelBill();
		HotelBill b2=new HotelBill();
		HotelBill b3=new HotelBill();

		b1.setItemCode(101);
		b1.setFoodName("Dosa");
		b1.setPrice(50);

		b2.setItemCode(102);
		b2.setFoodName("Idali");
		b2.setPrice(25);

		b3.setItemCode(103);
		b3.setFoodName("Uttapa");
		b3.setPrice(75);

		EntityManagerFactory  EntityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); 
		EntityManager entityManager=EntityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		try{transaction.begin();
		entityManager.persist(b1);
		entityManager.persist(b2);
		entityManager.persist(b3);
		System.out.println(" Items saved");
		transaction.commit();

		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}	
	}


	@Override
	public void show() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		try {
			HotelBill data=entityManager.find(HotelBill.class,101);
			HotelBill data1=entityManager.find(HotelBill.class,102);
			HotelBill data2=entityManager.find(HotelBill.class,103);
			System.out.println("All Item names.........");
			System.out.println("ItemCode:"+data.getItemCode());
			System.out.println("ItemName:"+data.getFoodName()); 
			System.out.println("ItemPrice:"+data.getPrice());
			System.out.println("*************************************************");

			System.out.println("ItemCode:"+data1.getItemCode());
			System.out.println("ItemName:"+data1.getFoodName()); 
			System.out.println("ItemPrice:"+data1.getPrice());
			System.out.println("*************************************************");

			System.out.println("ItemCode:"+data2.getItemCode());
			System.out.println("ItemName:"+data2.getFoodName()); 
			System.out.println("ItemPrice:"+data2.getPrice());
			System.out.println("*************************************************");


		}catch(Exception e) {
			System.out.println(e);
		}finally {
			entityManager.close();

		}


	}

	@Override
	public void order() {

		System.out.println("Enter the ItemCode:");
		int i=sc.nextInt();
		if(i==101) {
			System.out.println("Your bill of item is 50");
		}
		if(i==102) {
			System.out.println("Your bill of item is 25");
		}
		if(i==103) {
			System.out.println("Your bill of item is 75");
		}
}

	@Override
	public void operate() {
		System.out.println("Press A to add food items:");
		System.out.println("Press B to remove food items:");
		System.out.println("Press C to modify food items:");
		System.out.println("Enter a Alphabate:");
		String ch=sc.nextLine();
		switch(ch) {
		case "A":
			HotelBill b4=new HotelBill();

			System.out.println("Enter itemCode");
			int i=sc.nextInt();
			b4.setItemCode(i);
			System.out.println("Enter itemName");
			String j=sc.toString();
			b4.setFoodName(j);
			System.out.println("Enter price");
			int k=sc.nextInt();
			b4.setPrice(k);

			EntityManagerFactory  EntityManagerFactory=Persistence.createEntityManagerFactory("TestPersistence"); 
			EntityManager entityManager=EntityManagerFactory.createEntityManager();
			EntityTransaction transaction=entityManager.getTransaction();
			try {
				transaction.begin();
				entityManager.persist(b4);

				System.out.println(" Items saved");
				transaction.commit();

			} catch (Exception e) {
				transaction.rollback();
				e.printStackTrace();
			}finally {
				entityManager.close();
			}
			break;

		case "B":

			EntityManagerFactory  emf=Persistence.createEntityManagerFactory("TestPersistence"); 
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			try {
				et.begin();
				System.out.println("Enter itemCode to delete");
				int z=sc.nextInt();
				HotelBill hb = em.find(HotelBill.class,z );
				em.remove(hb);
				System.out.println(" Items removed...");
				et.commit();

			} catch (Exception e) {
				et.rollback();
				e.printStackTrace();
			}finally {
				em.close();
			}	
			break;

		case "C":
		
			EntityManagerFactory  emf2=Persistence.createEntityManagerFactory("TestPersistence"); 
			EntityManager em2=emf2.createEntityManager();
			EntityTransaction et2=em2.getTransaction();
			try {
				et2.begin();
				String jpql="update HotelBill set  foodCode='kabab' where id=102 ";
				Query query=em2.createQuery(jpql);
				int result=query.executeUpdate();
				System.out.println(result);
				et2.commit();
				} catch (Exception e) {
				et2.rollback();
				e.printStackTrace();
			}
			break;
			
			default :
				System.out.println("Invalid Input");
		
		}
	}
		

				
		@Override
		public void totalBill() {
			// TODO Auto-generated method stub

		}

	}
