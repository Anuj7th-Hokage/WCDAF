package CallableStatement;import java.sql.Connection;import java.sql.SQLException;import static java.lang.Class.forName;import static java.sql.DriverManager.getConnection;    public class Getconnection{        public static Connection getConn()throws ClassNotFoundException, SQLException {            Connection connection = null;            forName("com.mysql.cj.jdbc.Driver");            System.out.println("Driver is loaded");            connection = getConnection("jdbc:mysql://127.0.0.1:3306/mydb", "root", "9890099723");            return connection;        }    }