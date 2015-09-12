package org.gislers.chinook.persistence.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * Created by:   jim
 * Created date: 9/6/15
 */
@Entity
@Table(name = "invoice_line", schema = "chinook")
public class InvoiceLineEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="invoice_line_id")
    private long invoiceLineId;

    @Column(name="invoice_id")
    private long invoiceId;

    @Column(name="track_id")
    private long trackId;

    private BigDecimal unitPrice;
    private int quantity;

    public InvoiceLineEntity() {
    }

    public long getInvoiceLineId() {
        return invoiceLineId;
    }

    public void setInvoiceLineId(long invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    public long getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(long invoiceId) {
        this.invoiceId = invoiceId;
    }

    public long getTrackId() {
        return trackId;
    }

    public void setTrackId(long trackId) {
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
}
