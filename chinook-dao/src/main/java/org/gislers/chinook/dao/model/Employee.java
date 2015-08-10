package org.gislers.chinook.dao.model;

import java.util.Date;

public class Employee {

    private int employeeId;
    private String lastName;
    private String firstName;
    private String title;
    private int managerId;
    private Date birthDate;
    private Date hireDate;
    private String address;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phoneNumber;
    private String faxNumber;
    private String emailAddress;

    private Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getTitle() {
        return title;
    }

    public int getManagerId() {
        return managerId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public enum Column implements IColumn {
        EmployeeId,
        LastName,
        FirstName,
        Title,
        ReportsTo,
        BirthDate,
        HireDate,
        Address,
        City,
        State,
        Country,
        PostalCode,
        Phone,
        Fax,
        Email
    }
    
    public static final class Builder {

        private int employeeId;
        private String lastName;
        private String firstName;
        private String title;
        private int managerId;
        private Date birthDate;
        private Date hireDate;
        private String address;
        private String city;
        private String state;
        private String country;
        private String postalCode;
        private String phoneNumber;
        private String faxNumber;
        private String emailAddress;

        public Builder() {
        }

        public Builder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setManagerId(int managerId) {
            this.managerId = managerId;
            return this;
        }

        public Builder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setHireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setState(String state) {
            this.state = state;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setFaxNumber(String faxNumber) {
            this.faxNumber = faxNumber;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Employee build() {
            Employee employee = new Employee();
            employee.employeeId = employeeId;
            employee.lastName = lastName;
            employee.firstName = firstName;
            employee.title = title;
            employee.managerId = managerId;
            employee.birthDate = birthDate;
            employee.hireDate = hireDate;
            employee.address = address;
            employee.city = city;
            employee.state = state;
            employee.country = country;
            employee.postalCode = postalCode;
            employee.phoneNumber = phoneNumber;
            employee.faxNumber = faxNumber;
            employee.emailAddress = emailAddress;
            return employee;
        }
    }
}
