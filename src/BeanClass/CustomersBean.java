package BeanClass;

import java.io.Serializable;

public class CustomersBean implements Serializable {

    private Integer customerId;
    private String custName;
    private String firmName;
    private String accountTitle;
    private String accountNumber;
    private String customerType;
    private Integer cityId;
    private String cityName;
    private String address;
    private Float openingBalance;


    @Override
    public String toString() {
        return firmName;
    }

    public Integer getCustomerId() {
        if(customerId != null) return customerId;
        return 0;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustName() {
        if(custName != null) return custName;
        return "";
    }

    public void setCustName(String custName) {
        this.custName = custName;
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
}
