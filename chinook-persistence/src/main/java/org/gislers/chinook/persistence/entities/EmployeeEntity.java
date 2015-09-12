package org.gislers.chinook.persistence.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "employee", schema = "chinook")
public class EmployeeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="employee_id")
    private long employeeId;

    @ManyToOne(fetch=FetchType.LAZY)
    private EmployeeEntity reportsTo;

    @OneToMany(fetch= FetchType.LAZY, cascade= CascadeType.ALL, mappedBy="supportRep")
    private List<CustomerEntity> customerEntities;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String title;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="hire_date")
    private Date hireDate;

    private String address;
    private String city;
    private String state;
    private String country;

    @Column(name="postal_code")
    private String postalCode;

    private String phone;
    private String fax;
    private String email;

    public EmployeeEntity() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeEntity getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(EmployeeEntity reportsTo) {
        this.reportsTo = reportsTo;
    }

    public List<CustomerEntity> getCustomerEntities() {
        return customerEntities;
    }

    public void setCustomerEntities(List<CustomerEntity> customerEntities) {
        this.customerEntities = customerEntities;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeEntity{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", reportsTo=").append(reportsTo);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", birthDate=").append(birthDate);
        sb.append(", hireDate=").append(hireDate);
        sb.append(", address='").append(address).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", fax='").append(fax).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        EmployeeEntity employeeEntity = (EmployeeEntity) o;

        return new EqualsBuilder()
                .append(employeeId, employeeEntity.employeeId)
                .append(reportsTo, employeeEntity.reportsTo)
                .append(firstName, employeeEntity.firstName)
                .append(lastName, employeeEntity.lastName)
                .append(title, employeeEntity.title)
                .append(birthDate, employeeEntity.birthDate)
                .append(hireDate, employeeEntity.hireDate)
                .append(address, employeeEntity.address)
                .append(city, employeeEntity.city)
                .append(state, employeeEntity.state)
                .append(country, employeeEntity.country)
                .append(postalCode, employeeEntity.postalCode)
                .append(phone, employeeEntity.phone)
                .append(fax, employeeEntity.fax)
                .append(email, employeeEntity.email)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(employeeId)
                .append(reportsTo)
                .append(firstName)
                .append(lastName)
                .append(title)
                .append(birthDate)
                .append(hireDate)
                .append(address)
                .append(city)
                .append(state)
                .append(country)
                .append(postalCode)
                .append(phone)
                .append(fax)
                .append(email)
                .toHashCode();
    }
}
