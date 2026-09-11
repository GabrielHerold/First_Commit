package aumentosalario.application;

import java.util.Locale;
import java.util.Scanner;

import aumentosalario.entities.Employee;

public class Program {
    static void main() {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grosssalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + emp);
        System.out.print("Which percentage to increase salary ? ");
        double percentage = sc.nextDouble();
        emp.increasesalary(percentage);

        System.out.println("Update data: " + emp  );


    }
}
