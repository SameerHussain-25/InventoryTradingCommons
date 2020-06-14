package BeanClass;

import java.io.Serializable;
import java.sql.Timestamp;

public class TransectionBean implements Serializable {

    private Integer transectionId;
    private Timestamp transDate;
    private Integer customerId;
    private String name;
    private Integer fromGodownId;
    private Integer toGodownId;
    private String voucherType;
    private String paymentType;
    private Float packingExpence;
    private Float otherExpence;
    private Float discount;
    private Float totalAmount;
    private Boolean hasBillInHand;
    private String status;
    private String referenceBillNo;
    private String transportName;
    private String remarks;
    private String confirmedBy;


    public Integer getTransectionId() {
        if(transectionId != null) return transectionId;
        return 0;
    }

    public void setTransectionId(Integer transectionId) {
        this.transectionId = transectionId;
    }

    public Timestamp getTransDate() {
        if(transDate != null) return transDate;
        return null;
    }

    public void setTransDate(Timestamp transDate) {
        this.transDate = transDate;
    }

    public Integer getCustomerId() {
        if(customerId != null) return customerId;
        return 0;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        if(name != null) return name;
        return "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFromGodownId() {
        if(fromGodownId != null) return fromGodownId;
        return 0;
    }

    public void setFromGodownId(Integer fromGodownId) {
        this.fromGodownId = fromGodownId;
    }

    public Integer getToGodownId() {
        if(toGodownId != null) return toGodownId;
        return 0;
    }

    public void setToGodownId(Integer toGodownId) {
        this.toGodownId = toGodownId;
    }

    public String getVoucherType() {
        if(voucherType != null) return voucherType;
        return "";
    }

    public void setVoucherType(String voucherType) {
        this.voucherType = voucherType;
    }

    public String getPaymentType() {
        if(paymentType != null) return paymentType;
        return "";
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Float getPackingExpence() {
        if(packingExpence != null) return packingExpence;
        return Float.valueOf(0);
    }

    public void setPackingExpence(Float packingExpence) {
        this.packingExpence = packingExpence;
    }

    public Float getOtherExpence() {
        if(otherExpence != null) return otherExpence;
        return Float.valueOf(0);
    }

    public void setOtherExpence(Float otherExpence) {
        this.otherExpence = otherExpence;
    }

    public Float getDiscount() {
        if(discount != null) return discount;
        return Float.valueOf(0);
    }

    public void setDiscount(Float discount) {
        this.discount = discount;
    }

    public Float getTotalAmount() {
        if(totalAmount != null) return totalAmount;
        return Float.valueOf(0);
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Boolean getHasBillInHand() {
        if(hasBillInHand != null) return hasBillInHand;
        return false;
    }

    public void setHasBillInHand(Boolean hasBillInHand) {
        this.hasBillInHand = hasBillInHand;
    }

    public String getStatus() {
        if(status != null) return status;
        return "";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReferenceBillNo() {
        if(referenceBillNo != null) return referenceBillNo;
        return "";
    }

    public void setReferenceBillNo(String referenceBillNo) {
        this.referenceBillNo = referenceBillNo;
    }

    public String getTransportName() {
        if(transportName != null) return transportName;
        return "";
    }

    public void setTransportName(String transportName) {
        this.transportName = transportName;
    }

    public String getRemarks() {
        if(remarks != null) return remarks;
        return "";
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getConfirmedBy() {
        if(confirmedBy != null) return confirmedBy;
        return "";
    }

    public void setConfirmedBy(String confirmedBy) {
        this.confirmedBy = confirmedBy;
    }
}
