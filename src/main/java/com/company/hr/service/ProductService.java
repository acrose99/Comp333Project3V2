package com.company.hr.service;


import java.util.Set;

import javax.jws.WebService;


import com.company.hr.service.representation.ProductRepresentation;
import com.company.hr.service.representation.ProductRequest;

@WebService
public interface ProductService {

    public Set<ProductRepresentation> getProducts();
    public ProductRepresentation getProduct(String productID);
    public ProductRepresentation createProduct(ProductRequest productRequest);

    //public Response updateProduct(ProductRequest productRequest);
    //public Response deleteEmployee(String productID);


}
