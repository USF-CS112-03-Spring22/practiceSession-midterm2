package solution;

public class HourlyEmployee implements Payable {
    public String name;
    public double hourlySalary;
    public int numHours;

    public HourlyEmployee(String name, double hourlySalary, int numHours) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.numHours = numHours;
    }

    @Override
    public double getPaid() {
        double total =  numHours * hourlySalary;
        numHours = 0;
        return total;
    }
}
