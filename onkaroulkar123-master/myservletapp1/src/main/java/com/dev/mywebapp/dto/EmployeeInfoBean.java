package com.dev.mywebapp.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empinfo")
public class EmployeeInfoBean {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private double sallary;
	@Column
	private String designation;
	@Column
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}// end of class
