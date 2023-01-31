import models.Employee;
import models.Company;
public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        Employee employee1 = new Employee(1, "John Doe", 5000);
        Employee employee2 = new Employee(2, "Jane Doe", 6000);


        company.addEmployee(employee1);
        company.addEmployee(employee2);



        System.out.println(company);
    }
}




