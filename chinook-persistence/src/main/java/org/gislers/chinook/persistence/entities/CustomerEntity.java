package org.gislers.chinook.persistence.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "customer", schema = "chinook")
public class CustomerEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="customer_id")
    private long customerId;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="postal_code")
    private String postalCode;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="support_rep_id")
    private EmployeeEntity supportRep;

    @OneToMany(fetch=FetchType.LAZY, cascade= CascadeType.ALL, mappedBy="customerEntity")
    private List<InvoiceEntity> invoiceEntities;

    private String company;
    private String address;
    private String city;
    private String state;
    private String country;
    private String phone;
    private String fax;
    private String email;

    public CustomerEntity() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeEntity getSupportRep() {
        return supportRep;
    }

    public void setSupportRep(EmployeeEntity supportRep) {
        this.supportRep = supportRep;
    }

    public List<InvoiceEntity> getInvoiceEntities() {
        return invoiceEntities;
    }

    public void setInvoiceEntities(List<InvoiceEntity> invoiceEntities) {
        this.invoiceEntities = invoiceEntities;
    }
}
