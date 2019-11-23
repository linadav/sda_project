package lt.sdacademy.fundamentals.regex;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args){

        System.out.println(Pattern.matches(".s", "as")); // true: pirma bet koks simbolis, antras - "s" ir viso 2 simboliai
        System.out.println(Pattern.matches(".t", "dt")); // true
        System.out.println(Pattern.matches(".d", "odt")); // false
        System.out.println(Pattern.matches(".d", "oodt")); // false
        System.out.println(Pattern.matches("..t", "odt")); // true

        // el.pasto validacija:
        Pattern emailPattern = Pattern.compile("^(.+)@(.+)$");
        Matcher emailMatcher = emailPattern.matcher("d*.saltis@gmail.com");
        System.out.println(emailMatcher.matches()); // true
    }
}
