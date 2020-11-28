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

import  main.java.com.company.hr.service.representation.*;
import  main.java.com.company.hr.service.workflow.OrderActivity;
import  main.java.com.company.hr.service.workflow.ProductActivity;

@Path("/productservice/")
public class ProductResource implements ProductService {

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/product")
    //@Cacheable(cc="public, maxAge=3600") example for caching
    public Set<ProductRepresentation> getProducts() {
        System.out.println("GET METHOD Request for all products .............");
        ProductActivity proActivity = new ProductActivity();
        return proActivity.getProducts();
    }

    @GET
    @Produces({"application/xml" , "application/json"})
    @Path("/product/{productID}")
    public ProductRepresentation getProduct(@PathParam("productID") String id) {
        System.out.println("GET METHOD Request from Client with productRequest String ............." + id);
        ProductActivity proActivity = new ProductActivity();
        return proActivity.getProduct(id);
    }

    @POST
    @Produces({"application/xml" , "application/json"})
    @Path("/product")
    public ProductRepresentation createProduct(ProductRequest productRequest) {
        System.out.println("POST METHOD Request from Client with ............. ProductID: " + productRequest.getPartnerId() + "     name: " + productRequest.getName());
        ProductActivity proActivity = new ProductActivity();
        return proActivity.createProduct(productRequest.getName());
    }

    @DELETE
    @Produces({"application/xml" , "application/json"})
    @Path("/product/{productID}")
    public Response deleteProduct(@PathParam("productID") String id) {
        System.out.println("Delete METHOD Request from Client with productRequest String ............." + id);
        ProductActivity proActivity = new ProductActivity();
        String res = proActivity.deleteProduct(id);
        if (res.equals("OK")) {
            return Response.status(Status.OK).build();
        }
        return null;
    }

}