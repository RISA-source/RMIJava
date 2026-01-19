package workshop10;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalcServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            CalcInterface obj = new CalcImpl();
            Naming.rebind("rmi://localhost/CalcService", obj);
            System.out.println("Calculator RMI Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
