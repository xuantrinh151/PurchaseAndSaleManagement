/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;

/**
 *
 * @author xuant
 */
public class ProductDBContext extends DBContext {

    public ArrayList<Product> getTopThreeProduct() {
        ArrayList<Product> products = new ArrayList<>();
        String sql = "SELECT top 3 c.MaSP,s.TenSP,s.Gia,s.Anh,sum(SoLuong) AS Total,s.Loai\n"
                + "FROM CTHD c inner join SanPham s on c.MaSP = s.MaSP\n"
                + "WHERE S.Loai = N'Xuất'\n"
                + "GROUP BY c.MaSP ,s.TenSP,s.Gia,s.Anh,s.Loai\n"
                + "ORDER BY Total desc";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next()){
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getBigDecimal("Gia"));
                p.setpImage(rs.getString("Anh"));
                p.setQuantitySell(rs.getInt("Total"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  products;
    }
    
    
}
