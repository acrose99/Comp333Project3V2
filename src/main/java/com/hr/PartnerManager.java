package com.hr;

import java.util.Set;
import com.hr.dal.PartnerDAO;

public class PartnerManager {

    private static PartnerDAO dao = new PartnerDAO();

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

    public void updatePartner(String id, long salary) {
        dao.updatePartner(id);
    }

    public void deletePartner(String id) {
        dao.deletePartner(id);
    }

}
