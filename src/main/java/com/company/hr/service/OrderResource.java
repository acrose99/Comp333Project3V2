package com.company.hr.service;


import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.CacheControl;

import com.company.hr.service.representation.*;
import com.company.hr.service.workflow.CustomerActivity;
import com.company.hr.service.workflow.EmployeeActivity;
import com.company.hr.service.workflow.OrderActivity;

@Path("/orderservice/")
public class OrderResource implements OrderService {

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/order")
    //@Cacheable(cc="public, maxAge=3600") example for caching
    public Set<OrderRepresentation> getOrders() {
        System.out.println("GET METHOD Request for all employees .............");
        OrderActivity ordActivity = new OrderActivity();
        return ordActivity.getOrders();
    }

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/order/{orderID}")
    public OrderRepresentation getOrder(@PathParam("orderID") String id) {
        System.out.println("GET METHOD Request from Client with employeeRequest String ............." + id);
        OrderActivity ordActivity = new OrderActivity();
        return ordActivity.getOrder(id);
    }

    @POST
    @Produces({"application/xml" , "application/json"})
    @Path("/order")
    public OrderRepresentation createOrder(OrderRequest orderRequest) {
        System.out.println("POST METHOD Request from Client with ............. CustomerID: " + orderRequest.getCustomerID() + "     OrderID: " + orderRequest.getProductID());
        OrderActivity ordActivity = new OrderActivity();
        return ordActivity.createOrder(orderRequest.getCustomerID(), orderRequest.getProductID());
    }

    @DELETE
    @Produces({"application/xml" , "application/json"})
    @Path("/order/{orderID}")
    public Response deleteEmployee(@PathParam("orderID") String id) {
        System.out.println("Delete METHOD Request from Client with employeeRequest String ............." + id);
        OrderActivity ordActivity = new OrderActivity();
        String res = ordActivity.deleteOrder(id);
        if (res.equals("OK")) {
            return Response.status(Status.OK).build();
        }
        return null;
    }

}