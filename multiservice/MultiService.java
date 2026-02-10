package multiservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MultiService extends Remote {

    String sayHello() throws RemoteException;

    int add(int a, int b) throws RemoteException;

    int multiply(int a, int b) throws RemoteException;

    String getServerStatus() throws RemoteException;
}
