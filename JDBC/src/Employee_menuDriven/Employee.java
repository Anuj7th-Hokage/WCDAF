package Employee_menuDriven;import java.util.Scanner;import static Employee_menuDriven.SelectRecord.selectRecord;public class Employee {    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);        while (true) {            System.out.println("Choose option\n1 Select Record\n2. Insert Record\n3. Update Record\n4. Delete Record\n5. Exit");            System.out.print("Enter your choice: ");            int choice = scanner.nextInt();            switch (choice) {                case 1:                  selectRecord();                    break;                case 2:                    //    insertRecord();                    break;                case 3:                  //  updateRecord();                    break;                case 4:                  //  deleteRecord();                    break;                case 5:                    System.out.println("Exiting...");                    return;                default:                    System.out.println("Invalid choice");            }        }    }}