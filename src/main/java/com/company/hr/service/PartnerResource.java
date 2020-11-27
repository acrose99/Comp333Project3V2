package com.company.hr.service;


import com.company.hr.service.representation.PartnerRepresentation;
import com.company.hr.service.representation.PartnerRequest;
import com.company.hr.service.workflow.PartnerActivity;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.Set;

@Path("/partnerservice/")
public class PartnerResource implements PartnerService {

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/employee")
    //@Cacheable(cc="public, maxAge=3600") example for caching
    public Set<PartnerRepresentation> getPartners() {
        System.out.println("GET METHOD Request for all employees .............");
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.getPartners();
    }

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/employee/{employeeId}")
    public PartnerRepresentation getPartner(@PathParam("employeeId") String id) {
        System.out.println("GET METHOD Request from Client with employeeRequest String ............." + id);
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.getPartner(id);
    }

    @POST
    @Produces({"application/xml" , "application/json"})
    @Path("/employee")
    public PartnerRepresentation createPartner(PartnerRequest  partnerRequest) {
        System.out.println("POST METHOD Request from Client with ............." + partnerRequest.getFirstName() + "  " + partnerRequest.getLastName());
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.createPartner(partnerRequest.getFirstName(), partnerRequest.getLastName());
    }

//    @DELETE
//    @Produces({"application/xml" , "application/json"})
//    @Path("/employee/{employeeId}")
//    public Response deleteEmployee(@PathParam("employeeId") String id) {
//        System.out.println("Delete METHOD Request from Client with employeeRequest String ............." + id);
//        PartnerActivity empActivity = new PartnerActivity();
//        String res = empActivity.deleteEmployee(id);
//        if (res.equals("OK")) {
//            return Response.status(Status.OK).build();
//        }
//        return null;
//    }

}