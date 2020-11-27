package com.company.hr;

import java.util.Set;
import com.company.hr.dal.PartnerDAO;

public class CustomerManager {

    private static CustomerManager dao = new CustomerManager();

    public Set<Customer> getAllCustomers(){
        return dao.getAllCustomers();
    }

    public Customer getCustomer(String id) {
        return dao.getCustomer(id);
    }


    public Customer addCustomer(String firstName, String lastName) {

        Customer cus = dao.addCustomer(firstName, lastName);

        return cus;
    }

//    public void updateEmployee(String id, long salary) {
//        dao.updateEmployee(id, salary);
//    }
//
//    public void deleteEmployee(String id) {
//        dao.deleteEmployee(id);
//    }

}
