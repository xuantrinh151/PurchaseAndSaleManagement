/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author xuant
 */
public class Bill {
    private int bId;
    private Date time;
    
    private Customer customer;
    private User user;
    private ArrayList<BillDetail> billDetails;

    public ArrayList<BillDetail> getBillDetails() {
        return billDetails;
    }

    public void setBillDetails(ArrayList<BillDetail> billDetails) {
        this.billDetails = billDetails;
    }
    

    public int getbId() {
        return bId;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    

   

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTotal()
    {
        int sum = 0;
        for (BillDetail billDetail : billDetails) {
            sum += billDetail.getTotal();
        }
        return sum;
    }
}
