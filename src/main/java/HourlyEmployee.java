/** Represents an hourly employee at some company. Must implement Payable
 * and return the hourlySalary multiplied by the number of hours they worked.
 */
public class HourlyEmployee { // FILL IN CODE: implement Payable
    public String name; // Name of the employee
    public double hourlySalary; // hourly pay
    public int numHours; // number of hours this employee worked

    public HourlyEmployee(String name, double hourlySalary, int numHours) {
        this.name = name;
        this.hourlySalary = hourlySalary;
        this.numHours = numHours;
    }

   // FILL IN CODE:  add a method that is required to implement Payable
    // when an hourly employee gets paid,
    // they should get their hourly salary multiplied by the hours they worked;
    // after that the # of hours should be reset to 0.

}
