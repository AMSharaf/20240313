import controller.EmployeeController;
import view.EmployeeView;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(view);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Show All Employees");
            System.out.println("5. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    controller.addEmployee(id, name, salary);
                    break;

                case 2:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New Name: ");
                    String newName = sc.nextLine();

                    System.out.print("New Salary: ");
                    double newSalary = sc.nextDouble();

                    controller.updateEmployee(uid, newName, newSalary);
                    break;

                case 3:
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();
                    controller.deleteEmployee(did);
                    break;

                case 4:
                    controller.showAllEmployees();
                    break;

                case 5:
                    System.exit(0);
            }
        }
    }
}