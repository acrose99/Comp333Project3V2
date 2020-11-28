package  main.java.com.company.hr.service;


import  main.java.com.company.hr.service.representation.PartnerRepresentation;
import  main.java.com.company.hr.service.representation.PartnerRequest;
import  main.java.com.company.hr.service.workflow.PartnerActivity;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import java.util.Set;

@Path("/partnerservice/")
public class PartnerResource implements PartnerService {

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/partner")
    //@Cacheable(cc="public, maxAge=3600") example for caching
    public Set<PartnerRepresentation> getPartners() {
        System.out.println("GET METHOD Request for all employees .............");
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.getPartners();
    }

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/partner/{partnerID}")
    public PartnerRepresentation getPartner(@PathParam("partnerID") String id) {
        System.out.println("GET METHOD Request from Client with employeeRequest String ............." + id);
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.getPartner(id);
    }

    @POST
    @Produces({"application/xml" , "application/json"})
    @Path("/partner")
    public PartnerRepresentation createPartner(PartnerRequest  partnerRequest) {
        System.out.println("POST METHOD Request from Client with ............." + partnerRequest.getFirstName() + "  " + partnerRequest.getLastName());
        PartnerActivity patActivity = new PartnerActivity();
        return patActivity.createPartner(partnerRequest.getFirstName(), partnerRequest.getLastName());
    }

    @DELETE
    @Produces({"application/xml" , "application/json"})
    @Path("/partner/{partnerID}")
    public Response deleteEmployee(@PathParam("partnerID") String id) {
        System.out.println("Delete METHOD Request from Client with employeeRequest String ............." + id);
        PartnerActivity patActivity = new PartnerActivity();
        String res = patActivity.deletePartner(id);
        if (res.equals("OK")) {
            return Response.status(Status.OK).build();
        }
        return null;
    }

}