/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cdac.ds.dto;

/**
 *
 * @author suresh
 */
public class BOMItemDto {

    private long BOM_no;

    /**
     * Get the value of BOM_no
     *
     * @return the value of BOM_no
     */
    public long getBOM_no() {
        return BOM_no;
    }

    /**
     * Set the value of BOM_no
     *
     * @param BOM_no new value of BOM_no
     */
    public void setBOM_no(long BOM_no) {
        this.BOM_no = BOM_no;
    }

    private int itemNo;

    public int getItemNo() {
        return itemNo;
    }

    public void setItemNo(int itemNo) {
        this.itemNo = itemNo;
    }
    
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    private double scale;

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

   

   

    private double home_qoh;

    public double getHome_qoh() {
        return home_qoh;
    }

    public void setHome_qoh(double home_qoh) {
        this.home_qoh = home_qoh;
    }

    private String uom;

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    
}
