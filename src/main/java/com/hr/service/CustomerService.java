package com.hr.service;


import java.util.Set;

import javax.jws.WebService;
import javax.ws.rs.core.Response;

import com.hr.service.representation.CustomerRepresentation;
import  com.hr.service.representation.CustomerRequest;

@WebService
public interface CustomerService {

    public Set<CustomerRepresentation> getCustomers();
    public CustomerRepresentation getCustomer(String employeeId);
    public CustomerRepresentation createCustomer(CustomerRequest customerRequest);

    public CustomerRepresentation updateCustomer(CustomerRequest customerRequest);
    public Response deleteCustomer(String customerID);

}
