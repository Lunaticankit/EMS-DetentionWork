package models;
import java.util.ArrayList;
public class Company extends Employee{
    private ArrayList<Employee> employees;

    public Company() {
        super();
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String toString() {
        return "Company[employees=" + employees + "]";
    }
}