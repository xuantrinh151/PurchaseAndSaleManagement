/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author xuant
 */
public class Customer {

    private int cId;
    private String cName;
    private int cSdt;
    private String cAddress;
    private String cImage;
    private Role role;
    private int amountBought;

    public Customer() {
    }

    public Customer(int cId, String cName, int cSdt, String cAddress, String cImage, Role role) {
        this.cId = cId;
        this.cName = cName;
        this.cSdt = cSdt;
        this.cAddress = cAddress;
        this.cImage = cImage;
        this.role = role;
    }

    public int getAmountBought() {
        return amountBought;
    }

    public void setAmountBought(int amountBought) {
        this.amountBought = amountBought;
    }

    

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getcSdt() {
        return cSdt;
    }

    public void setcSdt(int cSdt) {
        this.cSdt = cSdt;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage;
    }
}
