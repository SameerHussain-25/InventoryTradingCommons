/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeanClass;

/**
 *
 * @author Salman Ahmed
 */
public class CityBean implements java.io.Serializable{
    private Integer cityId;
    private String cityName;

    @Override
    public String toString(){
        return cityName;
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
    
    
    
}
