package  main.java.com.company.hr.service;


import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import  main.java.com.company.hr.service.representation.CustomerRepresentation;
import  main.java.com.company.hr.service.representation.CustomerRequest;
import  main.java.com.company.hr.service.workflow.CustomerActivity;

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
        return cusActivity.createCustomer(customerRequest.getFirstName(), customerRequest.getLastName());
    }

    @DELETE
    @Produces({"application/xml" , "application/json"})
    @Path("/customer/{customerID}")
    public Response deleteCustomer(@PathParam("customerID") String id) {
        System.out.println("Delete METHOD Request from Client with employeeRequest String ............." + id);
        CustomerActivity cusActivity = new CustomerActivity();
        String res = cusActivity.deleteEmployee(id);
        if (res.equals("OK")) {
            return Response.status(Status.OK).build();
        }
        return null;
    }

}