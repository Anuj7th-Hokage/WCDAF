package ScrollableResultSet;import java.sql.Connection;import java.sql.ResultSet;import java.sql.SQLException;import java.sql.Statement;import java.util.Scanner;public class Scroll {    public static void main(String[] args) {        Connection cn = null;        try {            cn = GetConnection.getConn();            Statement st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);            Statement stn = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);            ResultSet rs=st.executeQuery("SELECT id, name, age, salary FROM emp");            ResultSet rss=stn.executeQuery("SELECT id, name, age, salary FROM emp");            System.out.println("Enter the option\n1.next\n2.previous\n3.first\n4.last\n5.relative\n6.absolute\n7.insert\n8.update\n9.delete");            Scanner sc = new Scanner(System.in);            int choose = sc.nextInt();            switch (choose) {                case 1:                    while (rs.next()) {                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    }                    break;                case 2:                    rs.last();                    while (rs.previous()) {                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    }                    break;                case 3:                    rs.first();                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    break;                case 4:                    rs.last();                    System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    break;                case 5:                    System.out.println("Enter relative postion:");                    int r = sc.nextInt();                    while (rs.relative(r)){                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    }                    break;                case 6:                    System.out.println("Enter absolute postion:");                    int rssx = sc.nextInt();                   rs.absolute(rssx);                        System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3) + " " + rs.getInt(4));                    break;                case 7:                    System.out.println("Insert employee id- ");                    int id=sc.nextInt();                    System.out.println("Insert employee name- ");                    String name=sc.next();                    System.out.println("Insert employee age- ");                    int age=sc.nextInt();                    System.out.println("Insert employee salary- ");                    int salary=sc.nextInt();                   rss.last();                   rss.moveToInsertRow();                   rss.updateInt(1,id);                   rss.updateString(2,name);                   rss.updateInt(3,age);                   rss.updateInt(4,salary);                   rss.insertRow();                   System.out.println("record added");                 break;                case 8:                    System.out.println("Update employee id- ");                    int idu=sc.nextInt();                    System.out.println("Update employee name- ");                    String nameu=sc.next();                    System.out.println("Update employee age- ");                    int ageu=sc.nextInt();                    System.out.println("Update employee salary- ");                    int salaryu=sc.nextInt();                    rss.absolute(3);                    rss.updateInt(1,idu);                    rss.updateString(2,nameu);                    rss.updateInt(3,ageu);                    rss.updateInt(4,salaryu);                    rss.updateRow();                    System.out.println("record Updated");                    break;                case 9:                    System.out.println("Enter delete row");                    int d=sc.nextInt();                    rss.absolute(d);                    rss.deleteRow();                    System.out.println("row deleted");                    break;            }        } catch (ClassNotFoundException e) {            throw new RuntimeException(e);        } catch (SQLException e) {            throw new RuntimeException(e);        }    }}