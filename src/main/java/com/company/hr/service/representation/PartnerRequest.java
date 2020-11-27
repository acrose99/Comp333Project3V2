package com.company.hr.service.representation;//equivalent to EmployeeRequest.java



import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
public class PartnerRequest {
    private String name;
    public PartnerRequest() {}

    public String getName() {return name;}

    public void setName() {this.name = name;}
}