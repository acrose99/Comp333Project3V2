package com.company.hr;// EmployeeManager.java

import com.company.hr.dal.ProductDAO;

import java.util.Set;


public class ProductManager {

    private static ProductDAO dao = new ProductDAO();

    public Set<Product> getAllProducts(){
        return dao.getAllProducts();
    }

    public Product getProduct(String id) {
        return dao.getProduct(id);
    }


    public Product addProduct(String firstName, String lastName) {

        Product pro = dao.addProduct(firstName, lastName);

        return pro;
    }

    public void updateProduct(String id, long salary) {
        dao.updateProduct(id);
    }

    public void deleteProduct(String id) {
        dao.deleteProduct(id);
    }

}