package BeanClass;

import java.io.Serializable;

public class DeterminationBean implements Serializable {

    private Integer transectionId;
    private Integer productId;
    private Float noOfPack;
    private Float quantity;


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

    public Float getNoOfPack() {
        if(noOfPack != null) return noOfPack;
        return Float.valueOf(0);
    }

    public void setNoOfPack(Float noOfPack) {
        this.noOfPack = noOfPack;
    }

    public Float getQuantity() {
        if(quantity != null) return quantity;
        return Float.valueOf(0);
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }
}
