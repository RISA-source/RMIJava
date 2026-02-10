package workshop10;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class StudentServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            StudentInterface obj = new StudentImpl();
            Naming.rebind("rmi://localhost/StudentService", obj);
            System.out.println("Student RMI Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
