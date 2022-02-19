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
import model.Customer;
import model.Role;

/**
 *
 * @author xuant
 */
public class CustomerDBContext extends DBContext {

    public ArrayList<Customer> getTopThreeCustomer() {
        ArrayList<Customer> customers = new ArrayList<>();
        String sql = "with t as (\n"
                + "	SELECT k.* ,c.* ,s.Gia,s.Gia * c.SoLuong as BillMoney from KhachHang k inner join HoaDon h on k.MaKH = h.MaKH \n"
                + "	inner join CTHD c on h.MaHD = c.MaHD\n"
                + "	inner join SanPham s on c.MaSP = s.MaSP\n"
                + "	where s.Loai = N'Xuất'\n"
                + ")\n"
                + "SELECT t.MaKH,t.HoTen,t.SDT,t.DiaChi,t.RoleID,t.Anh ,sum(t.BillMoney) as TotalMoney FROM t\n"
                + "group by t.MaKH,t.HoTen,t.SDT,t.DiaChi,t.RoleID,t.Anh \n"
                + "order by TotalMoney desc";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
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

}
