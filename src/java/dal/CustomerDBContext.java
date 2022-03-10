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
import model.Customer;
import model.Product;
import model.Role;

/**
 *
 * @author xuant
 */
public class CustomerDBContext extends DBContext {

    public ArrayList<Customer> getTopThreeCustomer(String time) {
        ArrayList<Customer> customers = new ArrayList<>();
        String sql = "with t as (\n"
                + "	SELECT k.* ,c.* ,s.Gia,s.Gia * c.SoLuong as BillMoney from KhachHang k inner join HoaDon h on k.MaKH = h.MaKH \n"
                + "	inner join CTHD c on h.MaHD = c.MaHD\n"
                + "	inner join SanPham s on c.MaSP = s.MaSP\n"
                + "	where s.Loai = N'Xuất' ";
        if (time != null && !time.equalsIgnoreCase("year")) {
            sql += " and  month(h.Ngay) = ? ";
        }
        sql += ")\n";
        sql += "SELECT top 3 t.MaKH,t.HoTen,t.SDT,t.DiaChi,t.RoleID,t.Anh ,sum(t.BillMoney) as TotalMoney FROM t\n"
                + "group by t.MaKH,t.HoTen,t.SDT,t.DiaChi,t.RoleID,t.Anh \n"
                + "order by TotalMoney desc";
        
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            if (time != null && !time.equalsIgnoreCase("year")) {
                stm.setString(1, time);
            }
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                c.setcAddress(rs.getString("DiaChi"));
                c.setcSdt(rs.getInt("SDT"));
                c.setcImage(rs.getString("Anh"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                c.setRole(r);
                c.setAmountBought(rs.getInt("TotalMoney"));
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    public Customer getCustomerByBid(int bId) {
        String sql = "select k.MaKH,k.HoTen,k.DiaChi,k.SDT,k.Anh,k.RoleID from HoaDon h  inner join KhachHang k on h.MaKH = k.MaKH\n"
                + "where h.MaHD = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                c.setcAddress(rs.getString("DiaChi"));
                c.setcSdt(rs.getInt("SDT"));
                c.setcImage(rs.getString("Anh"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                c.setRole(r);
                return c;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomer() {
        ArrayList<Customer> customers = new ArrayList<>();
        String sql = "select k.MaKH,k.HoTen,k.SDT,k.DiaChi,k.Anh,k.RoleID , r.Name as RoleName from KhachHang k inner join Role r on k.RoleID = r.ID";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                c.setcSdt(rs.getInt("SDT"));
                c.setcAddress(rs.getString("DiaChi"));
                c.setcImage(rs.getString("Anh"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                r.setrName(rs.getString("RoleName"));
                c.setRole(r);
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    public int addCustomer(Customer c) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "INSERT INTO [KhachHang]\n"
                + "([HoTen] ,[SDT],[DiaChi],[RoleID],[Anh])\n"
                + "VALUES (? ,? ,?,?,?)";
        int cId = 0;
        try {

            stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setString(1, c.getcName());
            stm.setInt(2, c.getcSdt());
            stm.setString(3, c.getcAddress());
            stm.setInt(4, c.getRole().getrId());
            if (c.getcImage() == "") {
                stm.setString(5, null);
            } else {
                stm.setString(5, c.getcImage());
            }

            stm.executeUpdate();
            rs = stm.getGeneratedKeys();
            if (rs.next()) {
                cId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
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
        return cId;
    }

    public void deleteCustomer(int cId) {
        String sql = "DELETE KhachHang"
                + " WHERE [MaKH] = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, cId);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void editCustomer(Customer c) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "UPDATE [KhachHang]\n"
                + "SET [HoTen] = ?,[SDT] = ?,[DiaChi] = ?,[RoleID] = ?,[Anh] = ?\n"
                + "WHERE [MaKH] = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setString(1, c.getcName());
            stm.setInt(2, c.getcSdt());
            stm.setString(3, c.getcAddress());
            stm.setInt(4, c.getRole().getrId());
            stm.setString(5, c.getcImage());
            stm.setInt(6, c.getcId());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
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

    public Customer getCustomer(int cId) {
        String sql = "SELECT [MaKH] ,[HoTen] ,[SDT],[DiaChi],[RoleID],[Anh]\n"
                + "  FROM [KhachHang] WHERE [MaKH] = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, cId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                c.setcAddress(rs.getString("DiaChi"));
                c.setcSdt(rs.getInt("SDT"));
                c.setcImage(rs.getString("Anh"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                c.setRole(r);
                return c;

            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<Customer> getCustomers(int pageindex, int pagesize, String keyWord) {
        ArrayList<Customer> customers = new ArrayList<>();
        try {
            String sql = "SELECT k.MaKH,k.HoTen,k.SDT,k.DiaChi,k.RoleID , k.Anh,k.Name as rName FROM \n"
                    + "            (SELECT *,ROW_NUMBER() OVER (ORDER BY kh.MaKH ASC) as row_index FROM KhachHang kh"
                    + "            inner join Role r on r.ID = kh.RoleID  \n";
            if (keyWord != null) {
                sql += " WHERE HoTen like ? ";
            }
            sql += ") k";
            sql += " WHERE row_index >= (? -1)* ? +1 AND row_index <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);

            if (keyWord != null) {
                stm.setString(1, "%" + keyWord + "%");
                stm.setInt(2, pageindex);
                stm.setInt(3, pagesize);
                stm.setInt(4, pageindex);
                stm.setInt(5, pagesize);
            } else {
                stm.setInt(1, pageindex);
                stm.setInt(2, pagesize);
                stm.setInt(3, pageindex);
                stm.setInt(4, pagesize);
            }

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                c.setcSdt(rs.getInt("SDT"));
                c.setcAddress(rs.getString("DiaChi"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                r.setrName(rs.getString("rName"));
                c.setRole(r);
                c.setcImage(rs.getString("Anh"));
                customers.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return customers;
    }

    public int count(String keyWord) {
        try {
            String sql = "SELECT count(*) as Total FROM KhachHang ";
            if (keyWord != null) {
                sql += " WHERE HoTen like ?";
            }
            PreparedStatement stm = connection.prepareStatement(sql);
            if (keyWord != null) {
                stm.setString(1, "%" + keyWord + "%");
            }
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

}
