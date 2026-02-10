package workshop10;

import java.rmi.Naming;
import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) {
        try {
            StudentInterface obj =
                (StudentInterface) Naming.lookup("rmi://localhost/StudentService");

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            String result = obj.getStudentDetails(id);
            System.out.println("Student Details: " + result);

            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
