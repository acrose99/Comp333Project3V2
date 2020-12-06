package com.hr.service.workflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.hr.Product;
import com.hr.ProductManager;
import com.hr.service.representation.ProductRepresentation;


/**
 * This class' responsibility is to manage the workflow of accessing/creating/updating/deleting resources
 * using the ProductDOA object.
 *
 */
public class ProductActivity {

    //private static ProductDAO dao = new ProductDAO();
    private static ProductManager pr = new ProductManager();

    public Set<ProductRepresentation> getProducts() {

        Set<Product> products = new HashSet<Product>();
        Set<ProductRepresentation> productRepresentations = new HashSet<ProductRepresentation>();
        //products = dao.getAllProducts();
        products = pr.getAllProducts();

        Iterator<Product> it = products.iterator();
        while(it.hasNext()) {
            Product pro = (Product)it.next();
            ProductRepresentation productRepresentation = new ProductRepresentation();
            productRepresentation.setPartnerId(pro.getProductID());
            productRepresentation.setName(pro.getName());

            //now add this representation in the list
            productRepresentations.add(productRepresentation);
        }
        return productRepresentations;
    }

    public ProductRepresentation getProduct(String id) {

        //com.company.hr.Product pro = dao.getProduct(id);
        Product pro = pr.getProduct(id);

        ProductRepresentation proRep = new ProductRepresentation();
        proRep.setName(pro.getName());
        proRep.setPartnerId(pro.getProductID());

        return proRep;
    }

    public ProductRepresentation createProduct(String name) {

        //com.company.hr.Product pro = dao.addProduct(firstName, lastName);
        Product pro = pr.addProduct(name);

        ProductRepresentation proRep = new ProductRepresentation();
        proRep.setName(pro.getName());
        proRep.setPartnerId(pro.getDescription());
        return proRep;
    }

    public String deleteProduct(String id) {

        //dao.deleteProduct(id);
        pr.deleteProduct(id);

        return "OK";
    }

}
