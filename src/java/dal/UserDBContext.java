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
import model.Role;
import model.User;

/**
 *
 * @author xuant
 */
public class UserDBContext extends DBContext {

    public User getUser(String userName, String passWord) {
        String sql = "select u.ID, u.TaiKhoan,u.MatKhau ,u.Hoten,u.RoleID,u.Anh ,r.Name from [User] u  "
                + "inner join Role r on r.ID = u.RoleID\n"
                + "where u.TaiKhoan = ? and u.MatKhau = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, userName);
            stm.setString(2, passWord);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User u = new User();
                u.setuId(rs.getInt("ID"));
                u.setuName(rs.getString("Hoten"));
                u.setuAccount(rs.getString("TaiKhoan"));
                u.setuPassword(rs.getString("MatKhau"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                r.setrName(rs.getString("Name"));
                u.setRole(r);
                u.setuImage(rs.getString("Anh"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();
        String sql = "SELECT [ID]\n"
                + "      ,[Hoten]\n"
                + "      ,[TaiKhoan]\n"
                + "      ,[MatKhau]\n"
                + "      ,[RoleID]\n"
                + "      ,[Anh]\n"
                + "  FROM [User]";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setuId(rs.getInt("ID"));
                u.setuName(rs.getString("Hoten"));
                u.setuAccount(rs.getString("TaiKhoan"));
                u.setuPassword(rs.getString("MatKhau"));
                u.setuImage(rs.getString("Anh"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                u.setRole(r);
                users.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    public User getUserById(int uId) {
        String sql = "SELECT [ID]\n"
                + "      ,[Hoten]\n"
                + "      ,[TaiKhoan]\n"
                + "      ,[MatKhau]\n"
                + "      ,[RoleID]\n"
                + "      ,[Anh]\n"
                + "  FROM [User] where ID = ?";
        try {
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, uId);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                User u = new User();
                u.setuId(rs.getInt("ID"));
                u.setuName(rs.getString("Hoten"));
                u.setuAccount(rs.getString("TaiKhoan"));
                u.setuPassword(rs.getString("MatKhau"));
                Role r = new Role();
                r.setrId(rs.getInt("RoleID"));
                u.setRole(r);
                u.setuImage(rs.getString("Anh"));
                return u;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
