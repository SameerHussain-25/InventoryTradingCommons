package BeanClass;

import java.io.Serializable;

public class ProductCategoryBean implements Serializable {

    private Integer prodCatId;
    private String prodCatName;
    private String remarks;

    public String toString(){
        return prodCatName;
    }

    public Integer getProdCatId() {
        if(prodCatId != null) return prodCatId;
        return 0;
    }

    public void setProdCatId(Integer prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getProdCatName() {
        if(prodCatName != null) return prodCatName;
        return "";
    }

    public void setProdCatName(String prodCatName) {
        this.prodCatName = prodCatName;
    }

    public String getRemarks() {
        if(remarks != null) return remarks;
        return "";
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
