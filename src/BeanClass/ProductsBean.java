package BeanClass;

import java.io.Serializable;
import java.sql.Timestamp;

public class ProductsBean implements Serializable {

    private Integer productId;

//  PRODUCT CATEGORY
    private Integer prodCatId;
    private String prodCatName;

    private String prodName;
    private String prodBrandName;
    private Float openingRate;
    private Float buyingRate;
    private Float saleRate;
    private Float openingOnhandQty;
    private Timestamp prodCreateDate;
    private Timestamp lastProdUpdate;
    private String updateBy;

//  UNIT
    private Integer unitId;
    private String unitName;

    private String remarks;


    public ProductsBean() {}

    public ProductsBean(Integer productId, Integer prodCatId, String prodName, String prodBrandName, Float saleRate, Integer unitId) {
        this.productId = productId;
        this.prodCatId = prodCatId;
        this.prodName = prodName;
        this.prodBrandName = prodBrandName;
        this.saleRate = saleRate;
        this.unitId = unitId;
    }

    public Integer getProductId() {
        if(productId != null) return productId;
        return 0;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public String getProdName() {
        if(prodName != null) return prodName;
        return "";
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdBrandName() {
        if(prodBrandName != null) return prodBrandName;
        return "";
    }

    public void setProdBrandName(String prodBrandName) {
        this.prodBrandName = prodBrandName;
    }

    public Float getOpeningRate() {
        if(openingRate != null) return openingRate;
        return Float.valueOf(0);
    }

    public void setOpeningRate(Float openingRate) {
        this.openingRate = openingRate;
    }

    public Float getBuyingRate() {
        if(buyingRate != null) return buyingRate;
        return Float.valueOf(0);
    }

    public void setBuyingRate(Float buyingRate) {
        this.buyingRate = buyingRate;
    }

    public Float getSaleRate() {
        if(saleRate != null) return saleRate;
        return Float.valueOf(0);
    }

    public void setSaleRate(Float saleRate) {
        this.saleRate = saleRate;
    }

    public Float getOpeningOnhandQty() {
        if(openingOnhandQty != null) return openingOnhandQty;
        return Float.valueOf(0);
    }

    public void setOpeningOnhandQty(Float openingOnhandQty) {
        this.openingOnhandQty = openingOnhandQty;
    }

    public Timestamp getProdCreateDate() {
        if(prodCreateDate != null) return prodCreateDate;
        return null;
    }

    public void setProdCreateDate(Timestamp prodCreateDate) {
        this.prodCreateDate = prodCreateDate;
    }

    public Timestamp getLastProdUpdate() {
        if(lastProdUpdate != null) return lastProdUpdate;
        return null;
    }

    public void setLastProdUpdate(Timestamp lastProdUpdate) {
        this.lastProdUpdate = lastProdUpdate;
    }

    public String getUpdateBy() {
        if(updateBy != null) return updateBy;
        return "";
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getUnitId() {
        if(unitId != null) return unitId;
        return 0;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        if(unitName != null) return unitName;
        return "";
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getRemarks() {
        if(remarks != null) return remarks;
        return "";
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
