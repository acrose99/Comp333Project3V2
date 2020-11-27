//equivalent to com.company.hr.Product DOA

package com.company.hr.dal;

import com.company.hr.Product;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class ProductDAO {
    private static Set<Product> products = new HashSet<Product>();

    public  ProductDAO() {
        Product product = new Product();
        product.setPartnerId("Mock Partner ID");
        product.setName("John");
        product.setName("John");
        product.setDescription("Description: Hello World");
        products.add(product);
    }

    public Set<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String id) {
        Iterator<Product> it = products.iterator();
        while(it.hasNext()) {
            Product pro = (Product)it.next();
            if (pro.getPartnerId().equals(id)) {
                return pro;
            }
        }
        return null;
    }

    public Product addProduct(String firstName, String lastName) {
        Product product = new Product();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        long randomLong = randomGenerator.nextLong();
        String id = "XY" + randomInt;

        product.setPartnerId(id);
        product.setName(firstName);
        products.add(product);

        return product;
    }

    public void updateProduct(String id) {
        Iterator<Product> it = products.iterator();
        while(it.hasNext()) {
            Product pro = (Product)it.next();
            if (pro.getPartnerId().equals(id)) {
                return;
            }
        }
    }

    public void deleteProduct(String id) {
        Iterator<Product> it = products.iterator();
        while(it.hasNext()) {
            Product pro = (Product)it.next();
            if (pro.getPartnerId().equals(id)) {
                products.remove(pro);
                return;
            }
        }
    }
}
