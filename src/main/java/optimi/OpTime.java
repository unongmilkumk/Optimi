package optimi;

import java.time.LocalTime;

public class OpTime {
    public static LocalTime hour_minute_second = LocalTime.of(LocalTime.now().getHour(), LocalTime.now().getMinute(), LocalTime.now().getSecond());
    public static int hour = LocalTime.now().getHour();
    public static int minute = LocalTime.now().getMinute();
    public static int second = LocalTime.now().getSecond();
}
