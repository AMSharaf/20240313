package controller;

import model.Employee;
import view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

public class EmployeeController {

    private List<Employee> employees;
    private EmployeeView view;

    public EmployeeController(EmployeeView view) {
        this.view = view;
        this.employees = new ArrayList<>();
    }

    // Add Employee
    public void addEmployee(int id, String name, double salary) {
        employees.add(new Employee(id, name, salary));
        view.showMessage("Employee added successfully!");
    }

    // Edit Employee
    public void updateEmployee(int id, String newName, double newSalary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setSalary(newSalary);
                view.showMessage("Employee updated!");
                return;
            }
        }
        view.showMessage("Employee not found!");
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        view.showMessage("Employee deleted (if existed).");
    }

    // Display All
    public void showAllEmployees() {
        view.displayAll(employees);
    }
}