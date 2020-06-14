package Customs;

import java.io.Serializable;

public class ReportBean implements Serializable {

    private Integer transectionId;
    private String date;
    private String voucharType;
    private String description;
    private Float credit;
    private Float debit;
    private Long balance;

    public Integer getTransectionId() {
        if(transectionId != null) return transectionId;
        return 0;
    }

    public void setTransectionId(Integer transectionId) {
        this.transectionId = transectionId;
    }

    public String getDate() {
        if(date != null) return date;
        return "";
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVoucharType() {
        if (voucharType != null) return voucharType;
        return "";
    }

    public void setVoucharType(String voucharType) {
        this.voucharType = voucharType;
    }

    public String getDescription() {
        if(description != null) return description;
        return "";
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCredit() {
        if(credit != null) return credit;
        return Float.valueOf(0);
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public Float getDebit() {
        if(debit != null) return debit;
        return Float.valueOf(0);
    }

    public void setDebit(Float debit) {
        this.debit = debit;
    }

    public Long getBalance() {
        if(balance != null) return balance;
        return Long.valueOf(0);
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
