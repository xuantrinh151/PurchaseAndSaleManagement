
package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author xuant
 */
public class DBContext {
    protected Connection connection;
    public DBContext(){
        try {
            String user = "trinhnx151";
            String pass = "trinhxq2";
            String url = "jdbc:sqlserver://DESKTOP-83LQ6GD\\TRINHNX151:1433;databaseName=PurchaseAndSaleManagement1";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
