package workshop10;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class DateTimeServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Start RMI registry
            DateTimeInterface obj = new DateTimeImpl();
            Naming.rebind("rmi://localhost/DateTimeService", obj);
            System.out.println("DateTime RMI Server is running...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
