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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Bill;
import model.BillDetail;
import model.Customer;
import model.Product;
import model.Role;
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
        String sql = "SELECT k.MaKH,k.HoTen,k.SDT,k.DiaChi,k.RoleID,k.Anh ,c.MaHD,c.MaSP,c.SoLuong,c.id,s.TenSP, s.Gia,s.Gia * c.SoLuong as BillMoney,h.Ngay ,u.Hoten\n"
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
                bd.setBdId(rs.getInt("id"));
                billDetails.add(bd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return billDetails;
    }

    public Bill getBillById(int bId) {
        Bill b = new Bill();
        String sql = "SELECT h.MaHD,k.HoTen,u.Hoten as NguoiLap, h.Ngay ,k.MaKH ,k.RoleID ,u.ID FROM HoaDon h\n"
                + "				inner join KhachHang k on h.MaKH = k.MaKH \n"
                + "              inner join [User] u on h.NguoiLap = u.ID where h.MaHD = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                b.setbId(rs.getInt("MaHD"));
                b.setTime(rs.getDate("Ngay"));
                Customer c = new Customer();
                c.setcName(rs.getString("HoTen"));
                c.setcId(rs.getInt("MaKH"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                c.setRole(r);
                
                b.setCustomer(c);
                User u = new User();
                u.setuName(rs.getString("NguoiLap"));
                u.setuId(rs.getInt("ID"));
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

    public ArrayList<Bill> getBills(int pageindex, int pagesize, int kRole) {
        ArrayList<Bill> bills = new ArrayList<>();
        try {
            String sql = "with t as (\n"
                    + "	SELECT h.MaHD,k.HoTen,u.HoTen as NguoiLap, h.Ngay  FROM \n"
                    + "                HoaDon h inner join KhachHang k on h.MaKH = k.MaKH \n"
                    + "                inner join [User] u on h.NguoiLap = u.ID\n"
                    + "                where k.RoleID = ?\n"
                    + ")\n"
                    + "SELECT s.MaHD,s.HoTen,s.NguoiLap,s.Ngay FROM \n"
                    + "(SELECT *,ROW_NUMBER() OVER (ORDER BY MaHD ASC) as row_index FROM t ) s\n"
                    + "WHERE row_index >= (? -1)* ? +1 AND row_index <= ? * ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, kRole);
            stm.setInt(2, pageindex);
            stm.setInt(3, pagesize);
            stm.setInt(4, pageindex);
            stm.setInt(5, pagesize);
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

    public int count(int kRole) {
        try {
            String sql = "SELECT count(*) as Total FROM HoaDon h inner join KhachHang k on h.MaKH = k.MaKH \n"
                    + "where k.RoleID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, kRole);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public int addBill(Bill b) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "INSERT INTO [HoaDon]\n"
                + "           ([MaKH]\n"
                + "           ,[NguoiLap]\n"
                + "           ,[Ngay])\n"
                + "     VALUES\n"
                + "           (?,?,?)";
        int pId = 0;
        try {

            stm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stm.setInt(1, b.getCustomer().getcId());
            stm.setInt(2, b.getUser().getuId());
            stm.setDate(3, b.getTime());
            stm.executeUpdate();
            rs = stm.getGeneratedKeys();
            if (rs.next()) {
                pId = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void addBillDetail(BillDetail bd) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = "INSERT INTO [CTHD]\n"
                + "           ([MaHD]\n"
                + "           ,[MaSP]\n"
                + "           ,[SoLuong])\n"
                + "     VALUES (?,? ,?)";

        try {

            stm = connection.prepareStatement(sql);
            stm.setInt(1, bd.getBill().getbId());
            stm.setInt(2, bd.getProduct().getpId());
            stm.setInt(3, bd.getQuantity());
            stm.executeUpdate();
            rs = stm.getGeneratedKeys();

        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void editBillDetail(BillDetail bd) {
        PreparedStatement stm = null;
        ResultSet rs = null;
        String sql = " UPDATE [CTHD]\n"
                + "  SET [MaSP] = ?,[SoLuong] = ?\n"
                + "  WHERE MaHD = ? and id = ?";

        try {

            stm = connection.prepareStatement(sql);
            stm.setInt(1, bd.getProduct().getpId());
            stm.setInt(2, bd.getQuantity());
            stm.setInt(3, bd.getBill().getbId());
            stm.setInt(4, bd.getBdId());
            stm.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
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

    public BillDetail getBillDetail(int pId, int bId) {
        String sql = "SELECT TOP (1000) [MaHD] ,[MaSP],[SoLuong],[id]\n"
                + "  FROM [CTHD] WHERE MaHD = ? and MaSP = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, bId);
            stm.setInt(2, pId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                BillDetail bd = new BillDetail();
                Bill b = new Bill();
                b.setbId(rs.getInt("MaHD"));
                Product p = new Product();
                p.setpId(rs.getInt("MaSP"));
                bd.setBill(b);
                bd.setProduct(p);
                bd.setBdId(rs.getInt("id"));
                bd.setQuantity(rs.getInt("SoLuong"));
                return bd;

            }
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void editBill(Bill b) {
        PreparedStatement stm = null;
        ResultSet rs = null;

        String sql = "UPDATE [HoaDon]\n"
                + "SET [MaKH] =  ?,[NguoiLap] = ?,[Ngay] = ?\n"
                + "WHERE [MaHD] = ?";
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, b.getCustomer().getcId());
            stm.setInt(2, b.getUser().getuId());
            stm.setDate(3, b.getTime());
            stm.setInt(4, b.getbId());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
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

    public void deleteBillDetail(int bdId) {
        String sql = "DELETE FROM [CTHD]\n"
                + "      WHERE id = ?";
        PreparedStatement stm = null;
        try {
            stm = connection.prepareStatement(sql);
            stm.setInt(1, bdId);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public void deleteBill(int bId) {
        PreparedStatement stm_deleteBillDetail = null;
        PreparedStatement stm_deleteBill = null;
        try {
            String sql_deleteBillDetail = "DELETE FROM [CTHD]\n"
                    + "      WHERE MaHD = ?";

            String sql_deleteBill = "DELETE FROM [HoaDon]\n"
                    + "      WHERE MaHD  = ?";
            connection.setAutoCommit(false);

            stm_deleteBillDetail = connection.prepareStatement(sql_deleteBillDetail);
            stm_deleteBillDetail.setInt(1, bId);
            stm_deleteBillDetail.executeUpdate();
            
            stm_deleteBill = connection.prepareStatement(sql_deleteBill);
            stm_deleteBill.setInt(1, bId);
            stm_deleteBill.executeUpdate();
            
            connection.commit();
        } catch (SQLException ex) {
            Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
            try {
                connection.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
                Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            //close connection       
            //close connection       
            if (stm_deleteBillDetail != null) {
                try {
                    stm_deleteBillDetail.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (stm_deleteBill != null) {
                try {
                    stm_deleteBill.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BillDBContext.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }

    public static void main(String[] args) {
        BillDBContext bd = new BillDBContext();
        System.out.println(bd.getBillById(13).getCustomer().getcId());
    }
}
