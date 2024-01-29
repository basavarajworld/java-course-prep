package DateConversion;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeS {
    LocalDateTime dt;
    int index;

    public TimeS(String dateT, int index) {

        // Parses a string representation of a date and time using the specified format
        // and returns a LocalDateTime object.
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        this.dt = LocalDateTime.parse(dateT, timeformat);
        this.index = index;
    }

    public void addDays(int nd) {
        this.dt = this.dt.plusDays(nd);
    }

    public void addHours(int nh) {
        this.dt = this.dt.plusHours(nh);
    }

    public void addMinutes(int nm) {
        this.dt = this.dt.plusMinutes(nm);
    }

    @Override
    public String toString() {
        return "{" +
                " dt='" + dt + "'" +
                ", index='" + index + "'" +
                "}";
    }

}
