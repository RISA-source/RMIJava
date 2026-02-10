package multiservice;

import java.rmi.Naming;

public class MultiClient {
    public static void main(String[] args) {
        try {
            MultiService obj =
                (MultiService) Naming.lookup("rmi://localhost/MultiService");

            System.out.println(obj.sayHello());
            System.out.println("Addition: " + obj.add(10, 5));
            System.out.println("Multiplication: " + obj.multiply(4, 6));
            System.out.println(obj.getServerStatus());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
