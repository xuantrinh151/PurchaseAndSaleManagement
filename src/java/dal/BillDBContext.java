/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author xuant
 */
public class BillDBContext extends DBContext{

    private BigDecimal getTotalSells() {
        BigDecimal totalSell = null;
        String sql = "SELECT SUM(h.TongTien) as TotalSell FROM  HoaDon h inner join KhachHang k  on h.MaKH = k.MaKH\n"
                + "WHERE K.RoleID = 4";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
             totalSell = rs.getBigDecimal("TotalSell");
            }
           
            
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSell;
    }
    
    public static void main(String[] args) {
        BillDBContext db = new BillDBContext();
        
        System.out.println(db.getTotalSells());
    }
}
