package com.ust.springrest.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.ust.springrest.dto.Employee;

@Repository                           //Same as component
public class EmployeeDaoImpl implements EmployeeDao{

	@PersistenceUnit                 //it is ORM annotation  same as autoWired 
	private EntityManagerFactory emf;
	
	@Override
	public Employee auth(String email, String pass) {
		String jpql = "From Employee where email=:email and password=:pwd";
		
		EntityManager em = emf.createEntityManager();
		Query qr = em.createQuery(jpql);
		qr.setParameter("email", email);
		qr.setParameter("pwd", pass);
		try {
		return (Employee) qr.getSingleResult();
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public boolean registerEmployee(Employee employee) {
		
		if(checkEmail(employee.getEmail())) {
			return false;
		}
			//
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(employee);
		et.commit();
		
		return true;
		
	}
	
	private boolean checkEmail(String email) {
		String jpql="From Employee where email=:email";
		
		EntityManager em = emf.createEntityManager();
		Query qr = em.createQuery(jpql);
		qr.setParameter("email", email);
		 
		try {
			qr.getSingleResult();
			return true;
		}catch(Exception e) {
			return false;
		}
		
		
	}

	@Override
	public boolean deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee employee=em.find(Employee.class, id);
		
		et.begin();
		if(employee==null)
		return false;
		try {
		em.remove(employee);
		et.commit();
		return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee employee1=em.find(Employee.class, employee.getId());
		
		if(employee==null)
			return false;
		
		 employee1.setName(employee.getName());
		 employee1.setPassword(employee.getPassword());
		 employee1.setDob(employee.getDob());
		 try {
		 et.begin();
		 em.persist(employee1);
		 et.commit();
		return true;
		 }catch(Exception e) {
			 return false;
		 }
	}

	@Override
	public List<Employee> getAllEmployee() {
		String jpql = "From Employee";
		EntityManager em = emf.createEntityManager();
		Query qr = em.createQuery(jpql);
		List<Employee> emp = qr.getResultList();
		
		return emp;
	}

	@Override
	public Employee getEmployee(int id) {
		// TODO Auto-generated method stub
		EntityManager em = emf.createEntityManager();
		//EntityTransaction et = em.getTransaction();
		
		Employee employee1=em.find(Employee.class, id);
		
		
			return employee1;
	
	}

}
