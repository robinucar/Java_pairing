package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Time {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        String formattedTime = dateTime.format(dtf);
        System.out.printf("the current " + ANSI_RED + "time" + ANSI_RESET + " is %s  \n ", formattedTime);

        // DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy
        // HH:mm:ss");

        // System.out.printf("The dat is %d \n ", myFormatObj);
    }
}
