package BeanClass;

import java.io.Serializable;

public class ProductTransectionBean implements Serializable {

    private Integer transectionId;
    private Integer productId;
    private String prodName;
    private String unitName;
    private Integer godownId;
    private String godownName;
    private Float quantity;
    private Float unitPrice;
    private Float amount;

    public Integer getTransectionId() {
        if(transectionId != null) return transectionId;
        return 0;
    }

    public void setTransectionId(Integer transectionId) {
        this.transectionId = transectionId;
    }

    public Integer getProductId() {
        if(productId != null) return productId;
        return 0;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProdName() {
        if(prodName != null) return prodName;
        return "";
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getUnitName() {
        if(unitName != null) return unitName;
        return "";
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public Integer getGodownId() {
        if(godownId != null) return godownId;
        return 0;
    }

    public void setGodownId(Integer godownId) {
        this.godownId = godownId;
    }

    public String getGodownName() {
        if(godownName != null) return godownName;
        return "";
    }

    public void setGodownName(String godownName) {
        this.godownName = godownName;
    }

    public Float getQuantity() {
        if(quantity != null) return quantity;
        return Float.valueOf(0);
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float getAmount() {
        if(amount != null) return amount;
        return Float.valueOf(0);
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
