package BeanClass;

import java.io.Serializable;
import java.sql.Timestamp;

public class TransectionBean implements Serializable {

    private Integer transectionId;
    private Timestamp transDate;

    //    CUSTOMER BEAN
    private Integer customerId;
    private String customerName;
    private String firmName;
    private String accountTitle;
    private String accountNumber;
    private String customerType;
    private Integer cityId;
    private String cityName;
    private String address;
    private Float openingBalance;

    //    USER BEAN
    private Integer userId;
    private String userName;
    private String password;
    private String privilege;

    private String custName;
    private Integer fromGodownId;
    private String fromGodownName;
    private Integer toGodownId;
    private String toGodownName;
    private String voucherType;
    private String paymentType;
    private Float packingExpence;
    private Float otherExpence;
    private Float discount;
    private Float totalAmount;
    private Float receivableAmount;
    private Float pendingAmount;
    private Boolean hasBillInHand;
    private String status;
    private String referenceBillNo;
    private String transportName;
    private String remarks;
    private String confirmedBy;

    public boolean isEmpty(){
        if(transectionId == null &
           transDate == null &
           customerId  == null &
           userId == null &
           custName == null &
           fromGodownId == null &
           toGodownId == null &
           voucherType == null &
           paymentType == null &
           packingExpence == null &
           otherExpence == null &
           discount == null &
           totalAmount == null &
           receivableAmount == null &
           pendingAmount == null &
           hasBillInHand == null &
           status == null &
           referenceBillNo == null &
           transportName == null &
           remarks == null &
           confirmedBy == null) return true;
        return false;
    }

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

    public String getCustomerName() {
        if(customerName != null) return customerName;
        return "";
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFirmName() {
        if(firmName != null) return firmName;
        return "";
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getAccountTitle() {
        if(accountTitle != null) return accountTitle;
        return "";
    }

    public void setAccountTitle(String accountTitle) {
        this.accountTitle = accountTitle;
    }

    public String getAccountNumber() {
        if(accountNumber != null) return accountNumber;
        return "";
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerType() {
        if(customerType != null) return customerType;
        return "";
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Integer getCityId() {
        if(cityId != null) return cityId;
        return 0;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        if(cityName != null) return cityName;
        return "";
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getAddress() {
        if(address != null) return address;
        return "";
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public Float getOpeningBalance() {
        if(openingBalance != null) return openingBalance;
        return Float.valueOf(0);
    }

    public void setOpeningBalance(Float openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Integer getUserId() {
        if(userId != null) return userId;
        return 0;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        if(userName != null) return userName;
        return "";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        if(password != null) return password;
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrivilege() {
        if(privilege != null) return privilege;
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
    public String getCustName() {
        if(custName != null) return custName;
        return "";
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public Integer getFromGodownId() {
        if(fromGodownId != null) return fromGodownId;
        return 0;
    }

    public void setFromGodownId(Integer fromGodownId) {
        this.fromGodownId = fromGodownId;
    }

    public String getFromGodownName() {
        if(fromGodownName != null) return fromGodownName;
        return "";
    }

    public void setFromGodownName(String fromGodownName) {
        this.fromGodownName = fromGodownName;
    }

    public Integer getToGodownId() {
        if(toGodownId != null) return toGodownId;
        return 0;
    }

    public void setToGodownId(Integer toGodownId) {
        this.toGodownId = toGodownId;
    }

    public String getToGodownName() {
        if(toGodownName != null) return toGodownName;
        return "";
    }

    public void setToGodownName(String toGodownName) {
        this.toGodownName = toGodownName;
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

    public Float getReceivableAmount() {
        if(receivableAmount != null) return receivableAmount;
        return Float.valueOf(0);
    }

    public void setReceivableAmount(Float receivableAmount) {
        this.receivableAmount = receivableAmount;
    }

    public Float getPendingAmount() {
        if(pendingAmount != null) return pendingAmount;
        return Float.valueOf(0);
    }

    public void setPendingAmount(Float pendingAmount) {
        this.pendingAmount = pendingAmount;
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
