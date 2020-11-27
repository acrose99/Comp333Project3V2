package com.company.hr.service;


import com.company.hr.service.representation.OrderRepresentation;
import com.company.hr.service.representation.OrderRequest;

import javax.jws.WebService;
import java.util.Set;

@WebService
public interface OrderService {

    public Set<OrderRepresentation> getOrders();
    public OrderRepresentation getOrder(String orderID);
    public OrderRepresentation addOrder(OrderRequest orderRequest);

    //public Response updateOrder(OrderRequest orderRequest);
    //public Response deleteOrder(String orderID);

}
