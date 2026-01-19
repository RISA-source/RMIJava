package workshop10;

import java.rmi.Naming;

public class DateTimeClient {
    public static void main(String[] args) {
        try {
            DateTimeInterface obj =
                    (DateTimeInterface) Naming.lookup("rmi://localhost/DateTimeService");
            String dateTime = obj.getDateTime();
            System.out.println("Current Date and Time from Server: " + dateTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
