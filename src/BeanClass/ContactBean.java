package BeanClass;

import java.io.Serializable;

public class ContactBean implements Serializable {

    private Integer contactId;

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

    private String contactName;
    private Boolean isWhatsappNumber;
    private String phoneNo;
    private String emailAddress;

    public Integer getContactId() {
        if(contactId != null) return contactId;
        return 0;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
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

    public String getContactName() {
        if(contactName != null) return contactName;
        return "";
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }


    public Boolean getIsWhatsappNumber() {
        if(isWhatsappNumber != null) return isWhatsappNumber;
        return false;
    }

    public void setIsWhatsappNumber(Boolean isWhatsappNumber) {
        this.isWhatsappNumber = isWhatsappNumber;
    }


    public String getPhoneNo() {
        if(phoneNo != null) return phoneNo;
        return "";
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmailAddress() {
        if(emailAddress != null) return emailAddress;
        return "";
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
