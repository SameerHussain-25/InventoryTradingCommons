package BeanClass;

import java.io.Serializable;

public class GodownBean implements Serializable {

    private Integer godownId;
    private String godownName;

    public String toString(){
        return godownName;
    }

    public GodownBean() {}

    public GodownBean(Integer godownId, String godownName) {
        this.godownId = godownId;
        this.godownName = godownName;
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
}
