import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee Information");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Display Employee Details");
            System.out.println("6. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

        switch (choice) {
            case 1:
                addEmployee(employees, scanner);
                break;
            case 2:
                updateEmployee(employees, scanner);
                break;
            case 3:
                deleteEmployee(employees, scanner);
                break;
            case 4:
                searchEmployee(employees, scanner);
                break;
            case 5:
                displayEmployeeDetails(employees);
                break;
            case 6:
                scanner.close();
                System.out.println("Exiting the program.");
                return;
            default:
                System.out.println("Invalid choice, Please try again.");
                break;        
            }
        }
    }

    private static boolean isEmployeeListEmpty(List<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("Employee list is empty.");
            return true;
        }
        return false;
    }

    public static void addEmployee(List<Employee> employees, Scanner scanner) {

        System.out.println("Enter Employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter Employee Name: ");
        String name = scanner.nextLine();
    
        System.out.println("Enter Department: ");
        String department = scanner.nextLine();
    
        System.out.println("Enter Position: ");
        String position = scanner.nextLine();
    
        System.out.println("Enter Salary: ");
        double salary = Double.parseDouble(scanner.nextLine());
    
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
    
        System.out.println("Enter Phone Number: ");
        String phoneNumber = scanner.nextLine();
    
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
    
        System.out.println("Enter Hire Date: ");
        String hireDate = scanner.nextLine();
    
        // Create a new Employee object
        Employee employee = new Employee(id, name, department, position, salary, email, phoneNumber, address, hireDate);
    
        // Add the employee to the list
        employees.add(employee);
    
        System.out.println("Employee added successfully!");
    }

    public static void updateEmployee(List<Employee> employees, Scanner scanner) {
        if (isEmployeeListEmpty(employees)) return;

        System.out.println("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Enter new Department: ");
                String department = scanner.nextLine();
                employee.setDepartment(department);

                System.out.println("Enter new Position: ");
                String position = scanner.nextLine();
                employee.setPosition(position);

                System.out.println("Enter new Salary: ");
                double salary = scanner.nextDouble();
                employee.setSalary(salary);
                scanner.nextLine(); // Consume newline

                System.out.println("Enter new Email: ");
                String email = scanner.nextLine();
                employee.setEmail(email);

                System.out.println("Enter new Phone Number: ");
                String phoneNumber = scanner.nextLine();
                employee.setPhoneNumber(phoneNumber);

                System.out.println("Enter new Address: ");
                String address = scanner.nextLine();
                employee.setAddress(address);

                System.out.println("Enter new Hire Date: ");
                String hireDate = scanner.nextLine();
                employee.setHireDate(hireDate);

                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }
    public static void deleteEmployee(List<Employee> employees, Scanner scanner) {
        if (isEmployeeListEmpty(employees)) return;
        
        System.out.println("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void searchEmployee(List<Employee> employees, Scanner scanner) {
        if (isEmployeeListEmpty(employees)) return;

        System.out.println("Enter Employee ID to search: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (Employee employee : employees) {
            if (employee.getId() == id) {
                System.out.println("Employee found: " + employee);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void displayEmployeeDetails(List<Employee> employees) {
        if (isEmployeeListEmpty(employees)) return;
        
        for (Employee employee : employees) {
            System.out.println(employee);
        } 
    }


}