package com.company.hr.service;


import java.util.Set;

import javax.jws.WebService;

import com.company.hr.service.representation.CustomerRepresentation;
import com.company.hr.service.representation.CustomerRequest;

@WebService
public interface CustomerService {

    public Set<CustomerRepresentation> getCustomers();
    public CustomerRepresentation getCustomer(String employeeId);
    public CustomerRepresentation createCustomer(CustomerRequest customerRequest);

    //public Response updateEmployee(EmployeeRequest employeeRequest);
    //public Response deleteEmployee(String employeeId);

}
