package  main.java.com.company.hr.service;


import java.util.Set;

import javax.jws.WebService;


import  main.java.com.company.hr.service.representation.PartnerRepresentation;
import  main.java.com.company.hr.service.representation.PartnerRequest;

@WebService
public interface PartnerService {

    public Set<PartnerRepresentation> getPartners();
    public PartnerRepresentation getPartner(String productID);
    public PartnerRepresentation createPartner(PartnerRequest productRequest);

    //public Response updateProduct(ProductRequest productRequest);
    //public Response deleteEmployee(String productID);


}
