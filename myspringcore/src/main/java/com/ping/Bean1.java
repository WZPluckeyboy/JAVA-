package com.ping;
import java.util.*;

public class Bean1 {
    //测试普通类属性的注入
    private int intValue;
    private String  strValue;
    private List listValue;
    private Map mapValue;
    private Set setValue;
    private String [] arrayStr;
    private Date dateValue;
    public Bean1(){}

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStrValue() {
        return strValue;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public List getListValue() {
        return listValue;
    }

    public void setListValue(List listValue) {
        this.listValue = listValue;
    }

    public Map getMapValue() {
        return mapValue;
    }

    public void setMapValue(Map mapValue) {
        this.mapValue = mapValue;
    }

    public Set getSetValue() {
        return setValue;
    }

    public void setSetValue(Set setValue) {
        this.setValue = setValue;
    }

    public String[] getArrayStr() {
        return arrayStr;
    }

    public void setArrayStr(String[] arrayStr) {
        this.arrayStr = arrayStr;
    }

    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    @Override
    public String toString() {
        return "Bean1{" +
                "intValue=" + intValue +
                ", strValue='" + strValue + '\'' +
                ", listValue=" + listValue +
                ", mapValue=" + mapValue +
                ", setValue=" + setValue +
                ", arrayStr=" + Arrays.toString ( arrayStr ) +
                ", dateValue=" + dateValue +
                '}';
    }
}
