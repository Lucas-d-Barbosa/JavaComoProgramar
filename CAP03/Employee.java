public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;

    public Employee(){

    }

    public Employee(String firstName, String lastName, Double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary > 0.0 ? salary : 0.0;

    }

    public void salaryIncrease(double valueIncrease){
        this.salary += valueIncrease > 0.0 ? 
            (valueIncrease / 100) * this.salary : 0.0; 
    }

    @Override
    public String toString(){
        return String.format("Employee: %s %s - Salary: %.2f", 
            this.firstName, this.lastName, this.salary);
    }

    

}
