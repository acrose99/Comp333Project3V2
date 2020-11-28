package  main.java.com.company.hr.service;


import  main.java.com.company.hr.service.representation.OrderRepresentation;
import  main.java.com.company.hr.service.representation.OrderRequest;

import javax.jws.WebService;
import java.util.Set;

@WebService
public interface OrderService {

    public Set<OrderRepresentation> getOrders();
    public OrderRepresentation getOrder(String orderID);
    public OrderRepresentation createOrder(OrderRequest orderRequest);

    //public Response updateOrder(OrderRequest orderRequest);
    //public Response deleteOrder(String orderID);

}
