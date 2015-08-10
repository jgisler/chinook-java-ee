package org.gislers.chinook.dao.model;

import java.math.BigDecimal;

public class InvoiceLine {

    private int invoiceLineId;
    private int invoiceId;
    private int trackId;
    private BigDecimal unitPrice;
    private int quantity;

    private InvoiceLine() {
    }

    public int getInvoiceLineId() {
        return invoiceLineId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public int getTrackId() {
        return trackId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public enum Column implements IColumn {
        InvoiceLineId,
        InvoiceId,
        TrackId,
        UnitPrice,
        Quantity
    }
    
    public static final class Builder {

        private int invoiceLineId;
        private int invoiceId;
        private int trackId;
        private BigDecimal unitPrice;
        private int quantity;

        public Builder() {
        }

        public Builder setInvoiceLineId(int invoiceLineId) {
            this.invoiceLineId = invoiceLineId;
            return this;
        }

        public Builder setInvoiceId(int invoiceId) {
            this.invoiceId = invoiceId;
            return this;
        }

        public Builder setTrackId(int trackId) {
            this.trackId = trackId;
            return this;
        }

        public Builder setUnitPrice(BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public InvoiceLine build() {
            InvoiceLine invoiceLine = new InvoiceLine();
            invoiceLine.invoiceLineId = invoiceLineId;
            invoiceLine.invoiceId = invoiceId;
            invoiceLine.trackId = trackId;
            invoiceLine.unitPrice = unitPrice;
            invoiceLine.quantity = quantity;
            return invoiceLine;
        }
    }
}
