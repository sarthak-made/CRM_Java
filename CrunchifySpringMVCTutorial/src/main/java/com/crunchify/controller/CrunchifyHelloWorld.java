package com.crunchify.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.crunchify.controller.CustomerPOJO.Customer;
import com.crunchify.controller.DAO.CustomerDAOImplementation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrunchifyHelloWorld {
	@Autowired
	CustomerDAOImplementation dao;
	
    @RequestMapping("/viewCustomers")
    public ModelAndView loadViewCustomers() {
    	List<Customer> cust = dao.loadCustomers();
        String message = "";
        for(Customer cs : cust) {
        	message = message + "<tr>" + "<td>" + Integer.toString(cs.getId()) + "</td>"
        							   + "<td>" + cs.getFirstName() + "</td>"
        							   + "<td>" + cs.getLastName() + "</td>"
        							   + "<td>" + cs.getEmailID() + "</td>"
        					  + "</tr>";
        	
        }
        return new ModelAndView("viewCustomers", "message", message);
    }
    
    @RequestMapping("/index")
    public ModelAndView loadIndex() {
    	return new ModelAndView("index");
    }
    
    @RequestMapping("/addCustomers")
    public ModelAndView loadAddCustomers() {
    	return new ModelAndView("addCustomers");
    }
}