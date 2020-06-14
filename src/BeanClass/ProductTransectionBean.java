package BeanClass;

import java.io.Serializable;

public class ProductTransectionBean implements Serializable {

    private Integer transectionId;
    private Integer productId;
    private Integer godownId;
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

    public Integer getGodownId() {
        if(godownId != null) return godownId;
        return 0;
    }

    public void setGodownId(Integer godownId) {
        this.godownId = godownId;
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
