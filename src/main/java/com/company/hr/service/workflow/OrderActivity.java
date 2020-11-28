package  main.java.com.company.hr.service.workflow;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import  main.java.com.company.hr.*;
import  main.java.com.company.hr.service.representation.OrderRepresentation;

/**
 * This class' responsibility is to manage the workflow of accessing/creating/updating/deleting resources
 * using the OrderDOA object.
 *
 */
public class OrderActivity {

    //private static EmployeeDAO dao = new EmployeeDAO();
    private static OrderManager om = new OrderManager();

    public Set<OrderRepresentation> getOrders() {

        Set<Order> orders = new HashSet<Order>();
        Set<OrderRepresentation> orderRepresentations = new HashSet<OrderRepresentation>();
        //employees = dao.getAllEmployees();
        orders = om.getAllOrders();

        Iterator<Order> it = orders.iterator();
        while(it.hasNext()) {
            Order ord = (Order)it.next();
            OrderRepresentation orderRepresentation = new OrderRepresentation();
            orderRepresentation.setOrderID(ord.getCustomerID());
            orderRepresentation.setCustomerID(ord.getCustomerID());
            orderRepresentation.setProductID(ord.getProductID());
            orderRepresentation.setFulfilled(ord.getFulfilled());

            //now add this representation in the list
            orderRepresentations.add(orderRepresentation);
        }
        return orderRepresentations;
    }

    public OrderRepresentation getOrder(String id) {

        //Employee emp = dao.getEmployee(id);
        Order ord = om.getOrder(id);

        OrderRepresentation ordRep = new OrderRepresentation();
        ordRep.setOrderID(ord.getOrderID());
        ordRep.setProductID(ord.getProductID());
        ordRep.setCustomerID(ord.getCustomerID());
        ordRep.setFulfilled(ord.getFulfilled());
        return ordRep;
    }

    public OrderRepresentation createOrder(String customerID, String productID) {

        //Employee emp = dao.addEmployee(firstName, lastName);
        Order ord = om.addOrder(customerID, productID);
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String id = "XY" + randomInt;

        OrderRepresentation ordRep = new OrderRepresentation();
        ordRep.setOrderID(id);

        ordRep.setProductID(ord.getProductID());
        ordRep.setCustomerID(ord.getCustomerID());
        ordRep.setFulfilled(ord.getFulfilled());

        return ordRep;
    }

    public String deleteOrder(String id) {

        //dao.deleteEmployee(id);
        om.deleteOrder(id);

        return "OK";
    }

}
