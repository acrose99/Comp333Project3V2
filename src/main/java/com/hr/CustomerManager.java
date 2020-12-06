package com.hr;

import java.util.Set;

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

    public void updateCustomer(String id, String email, String address, String password) {
        dao.updateCustomer(id, email, address, password);
    }

    public void deleteCustomer(String id) {
        dao.deleteCustomer(id);
    }

}
