package com.company.hr;

import java.util.Set;
import com.company.hr.dal.PartnerDAO;

public class PartnerManager {

    private static PartnerManager dao = new PartnerManager();

    public Set<Partner> getAllPartners(){
        return dao.getAllPartners();
    }

    public Partner getPartner(String id) {
        return dao.getPartner(id);
    }


    public Partner addPartner(String firstName, String lastName) {

        Partner pat = dao.addPartner(firstName, lastName);

        return pat;
    }

//    public void updateEmployee(String id, long salary) {
//        dao.updateEmployee(id, salary);
//    }
//
//    public void deleteEmployee(String id) {
//        dao.deleteEmployee(id);
//    }

}
