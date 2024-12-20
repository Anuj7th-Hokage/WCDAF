import java.sql.*;

public class EmpData {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver is loaded");

            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydb", "root", "9890099723");
            System.out.println("Connected to the database!");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT id, name, age, salary FROM emp1");


            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+" "+resultSet.getInt(4));

            }

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}

