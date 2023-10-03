package people;

public abstract class Employee extends Person {
    private HireDate hireDate;


    public Employee(String name) {
        super(name);
    }

    public HireDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(HireDate hireDate) {
        this.hireDate = hireDate;
    }

}
