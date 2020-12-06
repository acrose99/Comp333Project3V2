package com.hr.service;


import java.util.Set;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.hr.service.representation.CustomerRepresentation;
import com.hr.service.representation.CustomerRequest;
import  com.hr.service.workflow.CustomerActivity;

@Path("/customerservice/")
public class CustomerResource implements CustomerService {

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/customer")
    //@Cacheable(cc="public, maxAge=3600") example for caching
    public Set<CustomerRepresentation> getCustomers() {
        System.out.println("GET METHOD Request for all employees .............");
        CustomerActivity cusActivity = new CustomerActivity();
        return cusActivity.getCustomers();
    }

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/customer/{customerID}")
    public CustomerRepresentation getCustomer(@PathParam("customerID") String id) {
        System.out.println("GET METHOD Request from Client with employeeRequest String ............." + id);
        CustomerActivity cusActivity = new CustomerActivity();
        return cusActivity.getCustomer(id);
    }

    @POST
    @Produces({"application/xml" , "application/json"})
    @Path("/customer")
    public CustomerRepresentation createCustomer(CustomerRequest customerRequest) {
        System.out.println("POST METHOD Request from Client with ............." + customerRequest.getFirstName() + "  " + customerRequest.getLastName());
        CustomerActivity cusActivity = new CustomerActivity();
        return cusActivity.addCustomer(customerRequest.getFirstName(), customerRequest.getLastName());
    }
    @PUT
    @Produces({"application/xml" , "application/json"})
    @Path("/customer/{customerID}")
    public CustomerRepresentation updateCustomer(CustomerRequest customerRequest) {
        System.out.println("PUT METHOD Request from Client with ............." + customerRequest.getFirstName() + "  " + customerRequest.getLastName());
        CustomerActivity cusActivity = new CustomerActivity();
        return cusActivity.updateCustomer(customerRequest.getCustomerID(), customerRequest.getFirstName(), customerRequest.getLastName());
    }

    @DELETE
    @Produces({"application/xml" , "application/json"})
    @Path("/customer/{customerID}")
    public Response deleteCustomer(@PathParam("customerID") String id) {
        System.out.println("Delete METHOD Request from Client with employeeRequest String ............." + id);
        CustomerActivity cusActivity = new CustomerActivity();
        String res = cusActivity.deleteCustomer(id);
        if (res.equals("OK")) {
            return Response.status(Status.OK).build();
        }
        return null;
    }

}