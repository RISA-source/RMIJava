package workshop10;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class CalcImpl extends UnicastRemoteObject implements CalcInterface {

    protected CalcImpl() throws RemoteException {
        super();
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0)
            return 0;
        return a / b;
    }
}
