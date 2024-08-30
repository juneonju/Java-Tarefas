public class App {
    public static void main(String[] args) throws Exception {
        Enterprise empresa = new Enterprise();
        Employee pessoa1 = new Employee("junior", "desenvolvedor", 8000.0);
        Employee pessoa2 = new Employee("salis", "desenvolvedor", 6000.0);
        empresa.addEmployee(pessoa1);
        empresa.addEmployee(pessoa2);
        System.out.println(empresa.listEmployees());
        System.out.println(empresa.calculateTotalSalary());
        empresa.updateSalary("junior", 5000.0);
        System.out.println(empresa.calculateTotalSalary());
        System.out.println(empresa.findEmployeeByName("junior"));
    }
}
