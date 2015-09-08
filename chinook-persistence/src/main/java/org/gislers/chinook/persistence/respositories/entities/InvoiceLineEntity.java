package org.gislers.chinook.persistence.respositories.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "invoiceLine", schema = "chinook")
public class InvoiceLineEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer     invoiceLineId;
    private Integer     invoiceId;
    private Integer     trackId;
    private BigDecimal  unitPrice;
    private Integer     quantity;

    public InvoiceLineEntity() {
    }

    public Integer getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(Integer invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InvoiceLineEntity{");
        sb.append("invoiceLineId=").append(invoiceLineId);
        sb.append(", invoiceId=").append(invoiceId);
        sb.append(", trackId=").append(trackId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        InvoiceLineEntity that = (InvoiceLineEntity) o;

        return new EqualsBuilder()
                .append(invoiceLineId, that.invoiceLineId)
                .append(invoiceId, that.invoiceId)
                .append(trackId, that.trackId)
                .append(unitPrice, that.unitPrice)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(invoiceLineId)
                .append(invoiceId)
                .append(trackId)
                .append(unitPrice)
                .append(quantity)
                .toHashCode();
    }
}
