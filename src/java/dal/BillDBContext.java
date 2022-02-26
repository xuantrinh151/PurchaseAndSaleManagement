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
import model.Bill;
import model.BillDetail;
import model.Customer;
import model.Product;
import model.User;

/**
 *
 * @author xuant
 */
public class BillDBContext extends DBContext {

    public BigDecimal getTotalSells() {
        BigDecimal totalSell = null;
        String sql = "select sum(s.Gia * c.SoLuong)  as TotalSell  from CTHD c inner join SanPham s on c.MaSP = s.MaSP\n"
                + "where s.Loai = N'Xuất'";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                totalSell = rs.getBigDecimal("TotalSell");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalSell;
    }

    public BigDecimal getTotalCost() {
        BigDecimal totalCost = null;
        String sql = "select sum(s.Gia * c.SoLuong)  as TotalSell  from CTHD c inner join SanPham s on c.MaSP = s.MaSP\n"
                + "where s.Loai = N'Nhập'";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                totalCost = rs.getBigDecimal("TotalSell");
            }

        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalCost;
    }

    public ArrayList<Bill> getAllBill(int kRole) {
        ArrayList<Bill> bills = new ArrayList<>();
        String sql = "SELECT h.MaHD,k.HoTen,u.Hoten as NguoiLap, h.Ngay  FROM HoaDon h inner join KhachHang k on h.MaKH = k.MaKH \n"
                + "inner join [User] u on h.NguoiLap = u.ID\n"
                + "where k.RoleID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, kRole);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Bill b = new Bill();
                b.setbId(rs.getInt("MaHD"));
                Customer c = new Customer();
                c.setcName(rs.getString("HoTen"));
                b.setCustomer(c);
                User u = new User();
                u.setuName(rs.getString("NguoiLap"));
                b.setUser(u);
                b.setTime(rs.getDate("Ngay"));
                bills.add(b);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bills;
    }
    
    
    
    

    public ArrayList<BillDetail> getBillDetail(int bId) {
        ArrayList<BillDetail> billDetails = new ArrayList<>();
        String sql = "SELECT k.MaKH,k.HoTen,k.SDT,k.DiaChi,k.RoleID,k.Anh ,c.MaHD,c.MaSP,c.SoLuong,s.TenSP, s.Gia,s.Gia * c.SoLuong as BillMoney,h.Ngay ,u.Hoten\n"
                + "from KhachHang k inner join HoaDon h on k.MaKH = h.MaKH \n"
                + "	inner join CTHD c on h.MaHD = c.MaHD\n"
                + "	inner join SanPham s on c.MaSP = s.MaSP\n"
                + "	inner join [User] u  on u.ID = h.NguoiLap\n"
                + " 	where h.MaHD = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                BillDetail bd = new BillDetail();
                Bill b = new Bill();
                b.setbId(rs.getInt("MaHD"));
                b.setTime(rs.getDate("Ngay"));
                Customer c = new Customer();
                c.setcId(rs.getInt("MaKH"));
                c.setcName(rs.getString("HoTen"));
                b.setCustomer(c);
                User u = new User();
                u.setuName(rs.getString("HoTen"));
                b.setUser(u);
                bd.setBill(b);
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                p.setpName(rs.getString("TenSP"));
                p.setpPrice(rs.getInt("Gia"));
                bd.setProduct(p);
                bd.setQuantity(rs.getInt("SoLuong"));
                billDetails.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billDetails;
    }

    public Bill getBillById(int bId) {
        Bill b = new Bill();
        String sql = "SELECT h.MaHD,k.HoTen,u.Hoten as NguoiLap, h.Ngay  FROM HoaDon h\n"
                + "inner join KhachHang k on h.MaKH = k.MaKH \n"
                + "inner join [User] u on h.NguoiLap = u.ID where h.MaHD = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                b.setbId(rs.getInt("MaHD"));
                b.setTime(rs.getDate("Ngay"));
                Customer c = new Customer();
                c.setcName(rs.getString("HoTen"));
                b.setCustomer(c);
                User u = new User();
                u.setuName(rs.getString("NguoiLap"));
                b.setUser(u);
                return b;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    

    public int getTotalBill(int bId) {
        int total = 0;
        String sql = "select h.MaHD, sum(s.Gia * c.SoLuong )  as Total from SanPham s \n"
                + "			inner join CTHD c on s.MaSP = c.MaSP \n"
                + "			inner join HoaDon h on c.MaHD = h.MaHD \n"
                + "			where h.MaHD = ? \n"
                + "			group by h.MaHD";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                total = rs.getInt("Total");
                return total;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
}
