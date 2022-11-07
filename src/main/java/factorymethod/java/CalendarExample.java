package factorymethod.java;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        /**
         * 파라미터에 따라 생성되는 객체가 다른다.
         * class java.util.GregorianCalendar
         * class sun.util.BuddhistCalendar
         * class java.util.JapaneseImperialCalendar
         */
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
