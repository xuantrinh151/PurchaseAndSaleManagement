/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            while (rs.next()) {
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getInt("Gia"));
                p.setpImage(rs.getString("Anh"));
                p.setQuantitySell(rs.getInt("Total"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public int getProductSold() {
        int productSold = 0;
        String sql = "select sum (SoLuong) as ProductSold from CTHD";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                productSold = rs.getInt("ProductSold");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return productSold;
    }

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products = new ArrayList<Product>();
        String sql = "select s.MaSP,s.TenSP ,s.Gia,s.Anh,s.Loai  from SanPham s";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getInt("Gia"));
                p.setpType(rs.getString("Loai"));
                p.setpImage(rs.getString("Anh"));
                products.add(p);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public Product getProduct(int pId) {

        String sql = "select s.MaSP,s.TenSP ,s.Gia,s.Anh,s.Loai  from SanPham s where s.MaSP = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getInt("Gia"));
                p.setpType(rs.getString("Loai"));
                p.setpImage(rs.getString("Anh"));
                return p;

            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Product> getProducts(int pageindex, int pagesize) {
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT s.MaSP,s.TenSP,s.Gia,s.Anh,s.Loai FROM \n"
                    + "            (SELECT *,ROW_NUMBER() OVER (ORDER BY sp.MaSP ASC) as row_index FROM SanPham sp) s\n"
                    + "            WHERE row_index >= (? -1)* ? +1 AND row_index <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, pageindex);
            stm.setInt(2, pagesize);
            stm.setInt(3, pageindex);
            stm.setInt(4, pagesize);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getInt("Gia"));
                p.setpImage(rs.getString("Anh"));
                p.setpType(rs.getString("Loai"));
                products.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public int count() {
        try {
            String sql = "SELECT count(*) as Total FROM SanPham";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int addProduct(Product p) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "INSERT INTO [SanPham]\n"
                + "([TenSP],[Gia],[Anh],[Loai])  \n"
                + "VALUES (? ,?,?,?)";
        int pId = 0;
        try {

            stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, p.getpName());
            stm.setInt(2, p.getpPrice());
            stm.setString(3, p.getpImage());
            stm.setString(4, p.getpType());
            stm.executeUpdate();
            rs = stm.getGeneratedKeys();
            if (rs.next()) {
                pId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close Result Set Object
                if (rs != null) {
                    rs.close();
                }
                // Close Prepared Statement Object      
                if (stm != null) {
                    stm.close();
                }
                // Close Connection Object      
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
            }
        }
        return pId;
    }

    public void editProduct(Product p) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "UPDATE [dbo].[SanPham]\n"
                + "SET [TenSP] = ?,[Gia] = ?,[Anh] = ?,[Loai] = ?\n"
                + "WHERE [MaSP] = ?";
        
        try {

            stm = connection.prepareStatement(sql);
            stm.setString(1, p.getpName());
            stm.setInt(2, p.getpPrice());
            stm.setString(3, p.getpImage());
            stm.setString(4, p.getpType());
            stm.setInt(5, p.getpId());
            stm.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                // Close Result Set Object
                if (rs != null) {
                    rs.close();
                }
                // Close Prepared Statement Object      
                if (stm != null) {
                    stm.close();
                }
                // Close Connection Object      
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sqlException) {
            }
        }

    }

    public void deleteProduct(int pId) {
        String sql = "DELETE SanPham"
                + " WHERE [MaSP] = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, pId);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
