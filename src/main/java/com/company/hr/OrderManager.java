package main.java.com.company.hr;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import main.java.com.company.hr.dal.OrderDAO;

public class OrderManager {

    private static OrderDAO dao = new OrderDAO();

    public Set<Order> getAllOrders(){
        return dao.getAllOrders();
    }

    public Order getOrder(String id) {
        return dao.getOrder(id);
    }


    public Order addOrder(String customerID, String productID) {

        Order ord = dao.addOrder(customerID, productID);

        return ord;
    }

    public void updateOrderFulfilled(String id, Boolean fulfilled) {
        dao.updateOrderFulfilled(id, fulfilled);
    }

    public void deleteOrder(String id) {
        dao.deleteOrder(id);
    }

}
