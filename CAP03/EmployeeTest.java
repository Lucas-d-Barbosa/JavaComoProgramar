public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lucas", 
            "Barbosa", 1000.00);
        Employee emp2 = new Employee("Luiz", 
            "Dantas", 1350.00);
        
        System.out.println(emp1);
        System.out.println(emp2);


        emp1.salaryIncrease(10);
        emp2.salaryIncrease(10);

        System.out.println(emp1);
        System.out.println(emp2);

    }
}
