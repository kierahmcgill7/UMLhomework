package people;

public class Entrepreneur extends Person implements iPayable{
    public double revenue, expenses;


    public Entrepreneur(String name) {
        super(name);
    }
    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public Entrepreneur(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Entrepreneur{" +
                "revenue=" + revenue +
                ", expenses=" + expenses +
                '}';
    }

    @Override
    public double calculatePay() {
        return revenue - expenses;
    }
}
