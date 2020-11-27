package com.company.hr.service;


import java.util.Set;

import javax.jws.WebService;


import com.company.hr.service.representation.PartnerRepresentation;
import com.company.hr.service.representation.PartnerRequest;

@WebService
public interface PartnerService {

    public Set<PartnerRepresentation> getPartners();
    public PartnerRepresentation getPartner(String productID);
    public PartnerRepresentation createPartner(PartnerRequest productRequest);

    //public Response updateProduct(ProductRequest productRequest);
    //public Response deleteEmployee(String productID);


}
