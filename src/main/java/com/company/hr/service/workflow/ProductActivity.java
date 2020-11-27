package com.company.hr.service.workflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.company.hr.Product;
import com.company.hr.ProductManager;
import com.company.hr.service.representation.ProductRepresentation;


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
            productRepresentation.setPartnerId(pro.getPartnerId());
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
        proRep.setPartnerId(pro.getPartnerId());

        return proRep;
    }

    public ProductRepresentation createProduct(String firstName, String lastName) {

        //com.company.hr.Product pro = dao.addProduct(firstName, lastName);
        Product pro = pr.addProduct(firstName, lastName);

        ProductRepresentation proRep = new ProductRepresentation();
        proRep.setName(pro.getName());
        proRep.setPartnerId(pro.getPartnerId());
        return proRep;
    }

    public String deleteProduct(String id) {

        //dao.deleteProduct(id);
        pr.deleteProduct(id);

        return "OK";
    }

}
