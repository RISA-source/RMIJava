package workshop10;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class MultiServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MultiService obj = new MultiServiceImpl();
            Naming.rebind("rmi://localhost/MultiService", obj);
            System.out.println("Multi-Method RMI Server started...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
