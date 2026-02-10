package datetime;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeImpl extends UnicastRemoteObject implements DateTimeInterface {

    protected DateTimeImpl() throws RemoteException {
        super();
    }

    @Override
    public String getDateTime() throws RemoteException {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter);
    }
}
