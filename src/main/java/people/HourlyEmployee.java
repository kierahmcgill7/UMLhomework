package people;

public class HourlyEmployee extends Employee{
    public double hourlyRate, hoursWorked;

    public HourlyEmployee(String name) {
        super(name);
    }
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked){
        super("Kierah");
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
}
