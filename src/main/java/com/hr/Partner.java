//equivalent to Employee.java, EmployeeRepresentation.java


package com.hr;

import java.io.Serializable;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement


public class Partner {
    private String password;
    private String name;
    private String orderID;
    private String partnerID;

    public String getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(String productID) {
        this.partnerID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrderIDn() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }


    public void setID(String xy1111) {
        this.partnerID = orderID;
    }

    public Object getPartnerId() {
        return partnerID;
    }
}
