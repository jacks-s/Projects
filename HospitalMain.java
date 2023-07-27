package com.hibernates.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernates.dao.Hospital;
import com.hibernates.dto.HospitalCRUDOperation;

public class HospitalMain {
	static EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("mahavir");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	public static void main(String[] args) {
		Hospital h = new Hospital ();
		h.setAddress("mumbai");
		h.setEmail_id("mahaveer@gmail.com");
		h.setId(4);
		h.setName("mahaveer");
	
		
		
		h.setAddress("satara");
		h.setEmail_id("veer@gmail.com");
		h.setId(2);
		h.setName("veer");
		
		
		h.setAddress("pune");
		h.setEmail_id("mahi@gmail.com");
		h.setId(5);
		h.setName("mahi");
		
		//HospitalCRUDOperation.saveData(h);
		
	//Hospital h= HospitalCRUDOperation.saveData();
	
	
	HospitalCRUDOperation.printDataById(4);
	
	HospitalCRUDOperation.printDataByAll(h,1);
	HospitalCRUDOperation.deleteData(4);
	
	}

}
