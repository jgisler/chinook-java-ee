package org.gislers.chinook.persistence.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "invoice", schema = "chinook")
public class InvoiceEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     invoiceId;

    private Integer     customerId;
    private Date        invoiceDate;
    private String      billingAddress;
    private String      billingState;
    private String      billingCountry;
    private String      billingPostalCode;
    private BigDecimal  total;

    public InvoiceEntity() {
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getBillingPostalCode() {
        return billingPostalCode;
    }

    public void setBillingPostalCode(String billingPostalCode) {
        this.billingPostalCode = billingPostalCode;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InvoiceEntity{");
        sb.append("invoiceId=").append(invoiceId);
        sb.append(", customerId=").append(customerId);
        sb.append(", invoiceDate=").append(invoiceDate);
        sb.append(", billingAddress='").append(billingAddress).append('\'');
        sb.append(", billingState='").append(billingState).append('\'');
        sb.append(", billingCountry='").append(billingCountry).append('\'');
        sb.append(", billingPostalCode='").append(billingPostalCode).append('\'');
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        InvoiceEntity invoiceEntity = (InvoiceEntity) o;

        return new EqualsBuilder()
                .append(invoiceId, invoiceEntity.invoiceId)
                .append(customerId, invoiceEntity.customerId)
                .append(invoiceDate, invoiceEntity.invoiceDate)
                .append(billingAddress, invoiceEntity.billingAddress)
                .append(billingState, invoiceEntity.billingState)
                .append(billingCountry, invoiceEntity.billingCountry)
                .append(billingPostalCode, invoiceEntity.billingPostalCode)
                .append(total, invoiceEntity.total)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(invoiceId)
                .append(customerId)
                .append(invoiceDate)
                .append(billingAddress)
                .append(billingState)
                .append(billingCountry)
                .append(billingPostalCode)
                .append(total)
                .toHashCode();
    }
}
