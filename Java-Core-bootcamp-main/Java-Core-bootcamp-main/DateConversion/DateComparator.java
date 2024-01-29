package DateConversion;

import java.util.Comparator;

public class DateComparator implements Comparator<TimeS> {
    @Override
    public int compare(TimeS o1, TimeS o2) {
        int result = o1.dt.compareTo(o2.dt);

        if (result < 0) {
            return -1;
            // System.out.println("DateTime 1 is before DateTime 2");
        } else {
            return 1;
            // System.out.println("DateTime 1 is after DateTime 2");
        }
    }
}
