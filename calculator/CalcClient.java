package calculator;

import java.rmi.Naming;
import java.util.Scanner;

public class CalcClient {
    public static void main(String[] args) {
        try {
            CalcInterface obj =
                (CalcInterface) Naming.lookup("rmi://localhost/CalcService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            System.out.println("Sum = " + obj.add(a, b));
            System.out.println("Difference = " + obj.subtract(a, b));
            System.out.println("Product = " + obj.multiply(a, b));
            System.out.println("Division = " + obj.divide(a, b));

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
