package com.myCafe.service;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import com.myCafe.DTO.foodOrder;



@Service("MyCafeServiceImpl")
public class MyCafeServiceImpl {
	
	public void saveData(String userEnteredValue) {
		
//		EntityManagerFactory emf =Persistence.createEntityManagerFactory("hibernate.cfg.xml");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction et= em.getTransaction();
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
		
		foodOrder fd=new foodOrder();
		fd.setDescription(userEnteredValue);
		
//		et.begin();
//		session.persist(fd);
		session.save(fd);
		tx.commit();
		session.close();
		
		
		
	}

	public List<foodOrder> allOrder() {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
		
		  String hql = "from foodOrder ";
	        //String hql = "from FoodOrder where orderDescription =:orderDesc";
	       // String gel = "select orderId from FoodOrder where orderDescription =:orderDesc";
	        TypedQuery query = session.createQuery(hql);
	        //query.setParameter("orderDesc", "tea");
	        List<foodOrder> result = query.getResultList();
	        return result;
	
	}

}
