package people;


public class HireDate{
    //initialize variable
    String month, date, year;


    // constructor
    public HireDate(String month, String date, String year) {
        this.month = month;
        this.date = date;
        this.year = year;

    }

    // getters and setters give me access to these variables in different classes
    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    //toString() method
    @Override
    public String toString() {
        return "HireDate{" +
                "month='" + month + '\'' +
                ", date='" + date + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
