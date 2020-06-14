package BeanClass;

import java.io.Serializable;

public class ContactBean implements Serializable {

    private Integer contactId;
    private Integer customerId;
    private String contactName;
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

    public String getContactName() {
        if(contactName != null) return contactName;
        return "";
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
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
