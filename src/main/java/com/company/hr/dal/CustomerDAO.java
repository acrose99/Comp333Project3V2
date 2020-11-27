package com.company.hr.dal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import com.company.hr.Customer;

public class CustomerDAO{

    private static Set<Customer> customers = new HashSet<Customer>();

    public  CustomerDAO() {
        Customer customer = new Customer();

        /*
                Example
         */
        customer.setCustomerID("321321");
        customer.setFirstName("John");
        customer.setLastName("Smith");
        customer.setEmail("acrbrazil99@gmail.com");
        customer.setAddress("1234 willow lane");
        customer.setPassword("password123");
        customers.add(customer);
    }

    public Set<Customer> getAllCustomers(){
        return customers;
    }

    public Customer getCustomer(String id) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer emp = (Customer)it.next();
            if (emp.getCustomerID().equals(id)) {
                return emp;
            }
        }
        return null;
    }

    public Customer addCustomer(String firstName, String lastName, String email, String password, String address) {
        Customer customer = new Customer();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String id = "XY" + randomInt;

        customer.setCustomerID(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setEmail(email);
        customer.setPassword(password);
        customer.setAddress(address);

        customers.add(customer);

        return customer;
    }

    public void updateCustomerEmail(String id, String email) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer cus = (Customer)it.next();
            if (cus.getCustomerID().equals(id)) {
                cus.setEmail(email);
                return;
            }
        }
    }

    public void updateCustomerPassword(String id, String password) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer cus = (Customer)it.next();
            if (cus.getPassword().equals(password)) {
                cus.setPassword(password);
                return;
            }
        }
    }

    public void updateCustomerAddress(String id, String address) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer cus = (Customer)it.next();
            if (cus.getCustomerID().equals(id)) {
                cus.setAddress(address);
                return;
            }
        }
    }
    public void deleteCustomer(String id) {
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext()) {
            Customer cus = (Customer)it.next();
            if (cus.getCustomerID().equals(id)) {
                customers.remove(cus);
                return;
            }
        }
    }

}