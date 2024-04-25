import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employee Details");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter details for new Employee: ");
                System.out.println("First Name: ");  
                String fname = scanner.nextLine(); 
                System.out.println("Last Name: ");   
                String lname = scanner.nextLine(); 
                System.out.println("Employee ID: ");   
                String emp_Number = scanner.nextLine(); 
                scanner.nextLine();
                
                employees.add(new Employee(fname, lname, emp_Number));
                System.out.println("Employee Successfully Added");
                break;
                case 2:
                System.out.println("\nEmployee Details: ");
                for(Employee employee:employees) {
                    System.out.println(employee);
                }
                scanner.nextLine();
                break;
            case 3:
                System.out.println("Exiting Program, Have a nice day");
                scanner.close();
                return;
            default:
            System.out.println("Invalid choice, Please try again.");
                break;
            
            }
        }
    }

}