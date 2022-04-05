package solution;

import java.util.ArrayList;
import java.util.List;

public class Company {
    public static void main(String[] args) {
        Payable emp1 = new HourlyEmployee("Janet Smith", 30, 12);
        Payable emp2 = new HourlyEmployee("Alicia Johnson", 31, 10);
        Payable emp3 = new HourlyEmployee("Rachel Stones", 33, 8);

        // Add employees to the arraylist, iterate and pay each of them
        // print how much salary each one received
        List<Payable> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        for (Payable emp: employees) {
            System.out.println(emp.getPaid());
        }


    }
}
