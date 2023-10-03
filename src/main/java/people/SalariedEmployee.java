package people;

public class SalariedEmployee extends Employee {

    public int salary; //initialize variable
    //public double hours;

    public SalariedEmployee(String name) {
        super(name);
    }
    public SalariedEmployee(String name, int salary/*double hours*/) { /* is only inheriting from Employee*/

        super(name);
        this.salary = salary;
        //this.hours = hours;
    }


}
