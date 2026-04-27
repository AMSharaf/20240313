package view;

import model.Employee;
import java.util.List;

public class EmployeeView {

    public void displayEmployee(Employee emp) {
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("----------------------");
    }

    public void displayAll(List<Employee> employees) {
        for (Employee emp : employees) {
            displayEmployee(emp);
        }
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }
}