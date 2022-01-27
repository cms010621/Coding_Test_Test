import java.time.DayOfWeek;
import java.time.LocalDate;
public class coding_test_date {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String answer = "";

        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int dayOfWeekNumber = dayOfWeek.getValue();
        answer = arr[dayOfWeekNumber];

        System.out.println(answer);
    }
}