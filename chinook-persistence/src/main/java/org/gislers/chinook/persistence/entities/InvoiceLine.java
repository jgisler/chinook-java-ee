package org.gislers.chinook.persistence.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * Created by jim on 9/6/15.
 */
@Entity
public class InvoiceLine extends BaseEntity {

    @Id
    @GeneratedValue
    private Integer     invoiceLineId;
    private Integer     invoiceId;
    private Integer     trackId;
    private BigDecimal  unitPrice;
    private Integer     quantity;

    public InvoiceLine() {
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
        final StringBuilder sb = new StringBuilder("InvoiceLine{");
        sb.append("invoiceLineId=").append(invoiceLineId);
        sb.append(", invoiceId=").append(invoiceId);
        sb.append(", trackId=").append(trackId);
        sb.append(", unitPrice=").append(unitPrice);
        sb.append(", quantity=").append(quantity);
        sb.append('}');
        return sb.toString();
    }
}
