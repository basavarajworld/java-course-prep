package DateConversion;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Assignment2 {
    public static void main(String[] args) {
        try {
            // Sorting Time objects
            List<TimeS> times = new ArrayList<>();

            times.add(new TimeS("29/01/2024 01:00", 101));
            times.add(new TimeS("30/01/2024 08:57", 104));
            times.add(new TimeS("31/01/2024 16:32", 107));

            Collections.sort(times, new DateComparator());
            System.out.println("Sorted DATES:");
            for (TimeS t : times) {
                System.out.println(t);
            }

            // changng the datetime
            System.out.println("after Changing the DATE:");
            TimeS newtime = new TimeS("29/01/2024 01:00", 101);
            newtime.addDays(10);
            newtime.addHours(5);
            newtime.addMinutes(30);
            System.out.println(newtime);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
