package DateConversion;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Assignment1 {
    /**
     * This program reads a date and time input from the user, converts it to a
     * specific format,
     * and then converts it to the Indian Standard Time (IST) zone.
     * 
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            // String timeVal = reader.readLine();
            String timeVal = "29/01/2024 01:00";

            DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

            // Parses a string representation of a date and time using the specified format
            // and returns a LocalDateTime object.
            LocalDateTime dTime = LocalDateTime.parse(timeVal, timeformat);
            System.out.println("\nThe given date and time is : " + dTime);
            System.out.println(dTime.getHour());
            System.out.println(dTime.getMinute());

            // convert to IST
            ZonedDateTime istTime = ZonedDateTime.of(dTime, ZoneId.of("Asia/Kolkata"));
            System.out.println("\nThe given date and time is : " + istTime);
            System.out.println(istTime.getHour());
            System.out.println(istTime.getMinute());

            // IST to Unix Timestamp
            long unixTimestamp = istTime.toEpochSecond();
            System.out.println("\nThe given date and time is : " + unixTimestamp);

            // IST to UTC
            ZonedDateTime uTime = istTime.withZoneSameInstant(ZoneId.of("UTC"));
            System.out.println(uTime);

            // UTC to IST
            ZonedDateTime backToIST = uTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
            System.out.println("\nBack to IST Time : " + backToIST);
            System.out.println(backToIST.getHour());
            System.out.println(backToIST.getMinute());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
