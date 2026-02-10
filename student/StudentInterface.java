package student;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface StudentInterface extends Remote {
    String getStudentDetails(int id) throws RemoteException;
}
