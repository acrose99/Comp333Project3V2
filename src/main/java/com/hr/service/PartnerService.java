package com.hr.service;


import java.util.Set;

import javax.jws.WebService;


import com.hr.service.representation.PartnerRepresentation;
import com.hr.service.representation.PartnerRequest;

@WebService
public interface PartnerService {

    public Set<PartnerRepresentation> getPartners();
    public PartnerRepresentation getPartner(String productID);
    public PartnerRepresentation createPartner(PartnerRequest productRequest);

    //public Response updateProduct(ProductRequest productRequest);
    //public Response deleteEmployee(String productID);


}
