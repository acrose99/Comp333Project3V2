//equivalent to EmployeeRequest.java


package com.company.hr.service.representation;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class ProductRequest {
    private String name;
    public ProductRequest() {}

    public String getName() {return name;}

    public void setName() {this.name = name;}
}
