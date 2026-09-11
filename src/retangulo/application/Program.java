package retangulo.entities.application;

import java.util.Locale;
import java.util.Scanner;
import retangulo.entities.Rectangle;

public class Program {
    void main() {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rect.width = sc.nextDouble();
        rect.heigth = sc.nextDouble();

        System.out.printf("AREA = %.2f%n" , rect.area());
        System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
    }
}
