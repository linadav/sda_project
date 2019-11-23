package lt.sdacademy.fundamentals.date_time;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class Example1 {
    public static void main (String[] args){

        Date now = new Date();
        //arba
        long millis = System.currentTimeMillis();
        now = new Date(millis);
        System.out.println(now); // Trec Kovo 13 21:38:09 2019

        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime(); // koncertuojamas Calendar objektas i Date objekta
        System.out.println(date); // Trec Kovo 13 21:38:09 2019

        cal.setTime(now); // konvertuojamas Date objektas i Calendar objekta
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR));

        String dateInText = "2019-02-18";
        LocalDate localDate = LocalDate.parse(dateInText);
        System.out.println(localDate);
    }
}
