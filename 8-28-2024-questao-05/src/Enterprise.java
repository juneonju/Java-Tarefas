import java.util.ArrayList;
import java.util.List;

public class Enterprise {
    
    List<Employee> employees;

    public Enterprise() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public void updateSalary(String name, Double salary){
        if (findEmployeeByName(name) != null) {
            Double newSalary = salary;
            findEmployeeByName(name).salary = newSalary;
        }
    }

    public Double calculateTotalSalary(){
        Double totalSalary = 0.0;
        for (Employee employee : employees) {
            totalSalary = totalSalary + employee.salary;
        }
        return totalSalary;
    }

    public List<Employee> listEmployees(){
        return employees;
    }

    public Employee findEmployeeByName(String name){
        for (Employee employee : employees) {
            if (employee.name.equals(name)) {
                return employee;
            }
        }
        return null;
    }
}
