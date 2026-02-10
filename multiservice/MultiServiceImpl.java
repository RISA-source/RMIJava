package multiservice;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.time.LocalDateTime;

public class MultiServiceImpl extends UnicastRemoteObject
        implements MultiService {

    protected MultiServiceImpl() throws RemoteException {
        super();
    }

    public String sayHello() {
        return "Hello from RMI Server!";
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public String getServerStatus() {
        return "Server running at: " + LocalDateTime.now();
    }
}
