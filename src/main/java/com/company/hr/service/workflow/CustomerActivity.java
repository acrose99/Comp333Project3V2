package com.company.hr.service.workflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.company.hr.Customer;
import com.company.hr.CustomerManager;
import com.company.hr.Employee;
import com.company.hr.EmployeeManager;
import com.company.hr.dal.EmployeeDAO;
import com.company.hr.service.representation.CustomerRepresentation;
import com.company.hr.service.representation.EmployeeRepresentation;

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

    public CustomerRepresentation createCustomer(String firstName, String lastName) {

        //Employee emp = dao.addEmployee(firstName, lastName);
        Customer cus = cm.addCustomer(firstName, lastName);

        CustomerRepresentation cusREP = new CustomerRepresentation();
        cusREP.setFirstName(cus.getFirstName());
        cusREP.setLastName(cus.getLastName());
        cusREP.setCustomerID(cus.getCustomerID());

        return cusREP;
    }

    public String deleteEmployee(String id) {

        cm.deleteCustomer(id);

        return "OK";
    }

}
