package Employee_menuDriven;import java.sql.SQLException;import java.util.Scanner;public class Employee {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        boolean xd = true;        while (xd) {            System.out.println("Choose option\n1 Select Record\n2. Insert Record\n3. Update Record\n4. Delete Record\n5. Exit");            System.out.print("Enter your choice: ");            int choice = scanner.nextInt();            switch (choice) {                case 1:                    System.out.println("choose - \n1.order by Name \n2.order by ID \n3.order By salary");                    System.out.print("Enter your choice- ");                    int ch = scanner.nextInt();                    switch (ch) {                        case 1:                            try {                                SelectRecord.selectOrderByname();                            } catch (ClassNotFoundException e) {                                e.printStackTrace();                            } catch (SQLException e) {                                e.printStackTrace();                            }break;                case 2:                    try {                        SelectRecord.selectOrderById();                    } catch (ClassNotFoundException e) {                        e.printStackTrace();                    } catch (SQLException e) {                        e.printStackTrace();                    }                    break;                    case 3:                            try {                                SelectRecord.selectOrderBySalary();                            } catch (ClassNotFoundException e) {                                e.printStackTrace();                            } catch (SQLException e) {                                e.printStackTrace();                            }                            break;                    }                    break;                case 2:                    try {                        InsertRecord.insertRecord();                    } catch (ClassNotFoundException e) {                       e.printStackTrace();                    } catch (SQLException e) {                        e.printStackTrace();                    }                    break;                case 3:                    try {                        UpdateRecord.updateRecord();                    }catch (ClassNotFoundException e) {                        e.printStackTrace();                    } catch (SQLException e) {                        e.printStackTrace();                    }                    break;                case 4:                    try{                        DeleteRecord. deleteRecord();                    }catch (ClassNotFoundException e) {                        e.printStackTrace();                    } catch (SQLException e) {                        e.printStackTrace();                    }                    break;                case 5:                    System.out.println("You are Exit bro:)");                    xd=false;                    break;                default:                    System.out.println("Invalid choice");            }        }    }}