package BeanClass;

import java.io.Serializable;

public class UnitBean implements Serializable {

    private Integer unitId;
    private String unitName;

    public UnitBean() {}

    public UnitBean(Integer unitId, String unitName) {
        this.unitId = unitId;
        this.unitName = unitName;
    }

    public String toString(){
        return unitName;
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
}
