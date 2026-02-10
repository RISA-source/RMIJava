package student;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.HashMap;

public class StudentImpl extends UnicastRemoteObject
        implements StudentInterface {

    HashMap<Integer, String> students;

    protected StudentImpl() throws RemoteException {
        students = new HashMap<>();
        students.put(101, "Name: Ramesh | Marks: 85");
        students.put(102, "Name: Suresh | Marks: 90");
        students.put(103, "Name: Mahesh | Marks: 78");
    }

    @Override
    public String getStudentDetails(int id) throws RemoteException {
        if (students.containsKey(id))
            return students.get(id);
        else
            return "Student not found";
    }
}
