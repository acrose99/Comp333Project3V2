package com.hr.service.workflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import  com.hr.Customer;
import  com.hr.CustomerManager;
import com.hr.Order;
import com.hr.dal.CustomerDAO;
import  com.hr.service.representation.CustomerRepresentation;
import com.hr.service.representation.OrderRepresentation;

/**
 * This class' responsibility is to manage the workflow of accessing/creating/updating/deleting resources
 * using the CustomerDOA object.
 *
 */
public class CustomerActivity {

    //private static EmployeeDAO dao = new EmployeeDAO();
    private static CustomerManager cm = new CustomerManager();

    public Set<CustomerRepresentation> getCustomers() {

        Set<Customer> customers = new HashSet<Customer>();
        Set<CustomerRepresentation> customerRepresentations = new HashSet<CustomerRepresentation>();
        //employees = dao.getAllEmployees();
        customers = cm.getAllCustomers();

        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer cus = (Customer)it.next();
            CustomerRepresentation customerRepresentation = new CustomerRepresentation();
            customerRepresentation.setCustomerID(cus.getCustomerID());
            customerRepresentation.setFirstName(cus.getFirstName());
            customerRepresentation.setLastName(cus.getLastName());

            //now add this representation in the list
            customerRepresentations.add(customerRepresentation);
        }
        return customerRepresentations;
    }

    public CustomerRepresentation getCustomer(String id) {

        //Employee emp = dao.getEmployee(id);
        Customer cus = cm.getCustomer(id);

        CustomerRepresentation cusRep = new CustomerRepresentation();
        cusRep.setFirstName(cus.getFirstName());
        cusRep.setLastName(cus.getLastName());
        cusRep.setCustomerID(cus.getCustomerID());

        return cusRep;
    }

    public CustomerRepresentation addCustomer(String firstName, String lastName) {

        //Employee emp = dao.addEmployee(firstName, lastName);
        Customer cus = cm.addCustomer(firstName, lastName);
        CustomerRepresentation cusRep = new CustomerRepresentation();
        cusRep.setFirstName(cus.getFirstName());
        cusRep.setLastName(cus.getLastName());
        return cusRep;
    }

    public CustomerRepresentation updateCustomer(String id, String firstName, String lastName) {
        System.out.println("WIP");
        Customer cus = cm.getCustomer(id);
        CustomerRepresentation cusRep = new CustomerRepresentation();
        return cusRep;
    }
    public String deleteCustomer(String id) {
        CustomerDAO dao = new CustomerDAO();
        //dao.deleteEmployee(id);
        dao.deleteCustomer(id);
        return "OK";
    }

}
