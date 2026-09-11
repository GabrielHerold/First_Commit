package aumentosalario.entities;

public class Employee {

    public String name;
    public double grosssalary;
    public double tax;

    public double netsalary() {
        return grosssalary - tax;
    }

    public void increasesalary(double percentage) {
        grosssalary += grosssalary * percentage / 100;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f", netsalary());
    }
}