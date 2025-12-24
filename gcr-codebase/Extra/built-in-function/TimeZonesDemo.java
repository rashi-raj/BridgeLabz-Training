import java.time.ZonedDateTime;
import java.time.ZoneId;

public class TimeZonesDemo{
    public static void main(String[] args){

        // Current time in GMT
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));

        // Current time in IST
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

        // Current time in PST
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current Time in GMT: " + gmt);
        System.out.println("Current Time in IST: " + ist);
        System.out.println("Current Time in PST: " + pst);
    }
}
