package com.crunchify.controller.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Repository;
import com.crunchify.controller.hibernate.HibernateUtil;
import com.crunchify.controller.CustomerPOJO.Customer;



@Repository  //TO DO - ADD AUTO AWARE KEYWORD WHILE DECLARING THE CUSTOMERDAOIMPLEMENTATION OBJECT IN CONTROLLER
public class CustomerDAOImplementation implements CustomerDAO {

	@Override
	public List<Customer> loadCustomers() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		SQLQuery query1 = session.createSQLQuery("SELECT * FROM customers");
		List<Object[]> cust = query1.list();
		List<Customer> ans = new ArrayList<Customer>();
		for(Object[] item : cust) {
			Customer c1 = new Customer(Integer.parseInt(item[0].toString()), item[1].toString(), item[2].toString(), item[3].toString());
			ans.add(c1);
		}
		return ans;
	}

}
