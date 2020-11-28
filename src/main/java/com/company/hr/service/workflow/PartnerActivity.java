package  main.java.com.company.hr.service.workflow;


import  main.java.com.company.hr.Partner;
import  main.java.com.company.hr.PartnerManager;
import  main.java.com.company.hr.service.representation.PartnerRepresentation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PartnerActivity {

    //private static ProductDAO dao = new ProductDAO();
    private static PartnerManager pr = new PartnerManager();

    public Set<PartnerRepresentation> getPartners() {

        Set<Partner> partners = new HashSet<Partner>();
        Set<PartnerRepresentation> partnerRepresentations = new HashSet<PartnerRepresentation>();
        //products = dao.getAllPartners();
        partners = pr.getAllPartners();

        Iterator<Partner> it = partners.iterator();
        while(it.hasNext()) {
            Partner pat = (Partner)it.next();
            PartnerRepresentation partnerRepresentation = new PartnerRepresentation();
            partnerRepresentation.setPassword(pat.getPartnerID());
            partnerRepresentation.setName(pat.getName());

            //now add this representation in the list
            partnerRepresentations.add(partnerRepresentation);
        }
        return partnerRepresentations;
    }

    public PartnerRepresentation getPartner(String partnerID) {
        Partner pat = pr.getPartner(partnerID);

        PartnerRepresentation proRep = new PartnerRepresentation();
        proRep.setName(pat.getName());
        return proRep;
    }

    public PartnerRepresentation createPartner(String firstName, String lastName) {

        //com.company.hr.Product pro = dao.addProduct(firstName, lastName);
        Partner pat = pr.addPartner(firstName, lastName);

        PartnerRepresentation proRep = new PartnerRepresentation();
        proRep.setName(pat.getName());
        return proRep;
    }

    public String deletePartner(String id) {

        //dao.deleteProduct(id);
        pr.deletePartner(id);

        return "OK";
    }

}
