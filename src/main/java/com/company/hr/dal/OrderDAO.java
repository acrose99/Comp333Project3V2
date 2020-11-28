package  main.java.com.company.hr.dal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import  main.java.com.company.hr.Customer;
import  main.java.com.company.hr.Order;

public class OrderDAO{

    private static Set<Order> orders = new HashSet<Order>();

    public  OrderDAO(String customerID, String productID ) {
        Order order = new Order();

        /*
                Example
         */
        order.setFulfilled(false);
        order.setOrderID("32132");
        order.setProductID(productID);
        order.setCustomerID(customerID);
        orders.add(order);
    }
    public  OrderDAO() {
        Order order = new Order();

        /*
                Example
         */
        order.setFulfilled(false);
        order.setOrderID("32132");
        order.setProductID("N/A");
        order.setCustomerID("N/A");
        orders.add(order);
    }
    public Set<Order> getAllOrders(){
        return orders;
    }

    public Order getOrder(String id) {
        Iterator<Order> it = orders.iterator();
        while(it.hasNext()) {
            Order ord = (Order) it.next();
            if (ord.getOrderID().equals(id)) {
                return ord;
            }
        }
        return null;
    }

    public Order addOrder(String customerID, String productID, boolean fulfilled) {
        Order order = new Order();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String id = "XY" + randomInt;

        order.setOrderID(id);
        order.setCustomerID(customerID);
        order.setProductID(productID);
        order.setFulfilled(fulfilled);
        orders.add(order);

        return order;
    }

    public Order addOrder(String customerID, String productID) {
        Order order = new Order();

        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        String id = "XY" + randomInt;

        order.setOrderID(id);
        order.setCustomerID(customerID);
        order.setProductID(productID);
        order.setFulfilled(false);
        orders.add(order);

        return order;
    }
    public void updateOrderFulfilled(String id, boolean fulfilled) {
        Iterator<Order> it = orders.iterator();
        while(it.hasNext()) {
            Order ord = (Order)it.next();
            if (ord.getCustomerID().equals(id)) {
                ord.setFulfilled(fulfilled);
                return;
            }
        }
    }
    public void deleteOrder(String id) {
        Iterator<Order> it = orders.iterator();
        while(it.hasNext()) {
            Order ord = (Order)it.next();
            if (ord.getCustomerID().equals(id)) {
                orders.remove(ord);
                return;
            }
        }
    }

}