package com.company.hr.dal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;;
import com.company.hr.Partner;

public class PartnerDAO {
    private static Set<Partner> partners = new HashSet<Partner>();

    public  PartnerDAO() {
        Partner product = new Partner();
        product.setName("Swag Inc.");
        product.setPassword("Description: Hello World");
        partners.add(product);
    }

    public Set<Partner> getAllPartners(){
        return partners;
    }

    public Partner getPartner(String id) {
        Iterator<Partner> it = partners.iterator();
        while(it.hasNext()) {
            Partner pro = (Partner)it.next();
            if (pro.getPartnerID().equals(id)) {
                return pro;
            }
        }
        return null;
    }

    public Partner addPartner(String firstName, String lastName) {
        Partner product = new Partner();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        long randomLong = randomGenerator.nextLong();
        String id = "PR" + randomInt;

        product.setPartnerID(id);
        product.setName(firstName);
        partners.add(product);

        return product;
    }

    public void updatePartner(String id) {
        Iterator<Partner> it = partners.iterator();
        while(it.hasNext()) {
            Partner pro = (Partner)it.next();
            if (pro.getPartnerID().equals(id)) {
                return;
            }
        }
    }

    public void deletePartner(String id) {
        Iterator<Partner> it = partners.iterator();
        while(it.hasNext()) {
            Partner pro = (Partner)it.next();
            if (pro.getPartnerID().equals(id)) {
                partners.remove(pro);
                return;
            }
        }
    }
}
