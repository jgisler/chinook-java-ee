package org.gislers.chinook.dao.model;

import java.util.Date;

public class Invoice {

    private int invoiceId;
    private int customerId;
    private Date invoiceDate;
    private String billingAddress;
    private String billingCity;
    private String billingState;
    private String billingCountry;
    private String billingPostalCode;

    private Invoice() {
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public enum Column implements IColumn {
        InvoiceId,
        CustomerId,
        InvoiceDate,
        BillingAddress,
        BillingCity,
        BillingState,
        BillingCountry,
        BillingPostalCode,
        Total
    }
    
    public static final class Builder {

        private int invoiceId;
        private int customerId;
        private Date invoiceDate;
        private String billingAddress;
        private String billingCity;
        private String billingState;
        private String billingCountry;
        private String billingPostalCode;

        public Builder() {
        }

        public Builder setInvoiceId(int invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setCustomerId(int customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setInvoiceDate(Date invoiceDate) {
            this.invoiceDate = invoiceDate;
            return this;
        }

        public Builder setBillingAddress(String billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public Builder setBillingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public Builder setBillingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        public Builder setBillingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public Builder setBillingPostalCode(String billingPostalCode) {
            this.billingPostalCode = billingPostalCode;
            return this;
        }

        public Invoice build() {
            Invoice invoice = new Invoice();
            invoice.invoiceId = invoiceId;
            invoice.customerId = customerId;
            invoice.invoiceDate = invoiceDate;
            invoice.billingAddress = billingAddress;
            invoice.billingCity = billingCity;
            invoice.billingState = billingState;
            invoice.billingCountry = billingCountry;
            invoice.billingPostalCode = billingPostalCode;
            return invoice;
        }
    }
}
