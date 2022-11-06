package basics;

import java.time.*;


public class DateAndTimeExamples
{
    public static void main(String[] args)
    {
        // LoaclTime
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now its :- " + localTime );
        System.out.println("Now its :- " + localTime.getHour() + "::" + localTime.getMinute()+ "::" + localTime.getSecond());
        System.out.printf("Now its :- " +"%d/%d/%d\n",localTime.getHour(),localTime.getMinute(),localTime.getSecond());

        LocalTime localTime1 = LocalTime.now().withSecond(0).withNano(0);
        System.out.println("Now its :- " + localTime1);

        // Increase localTime1 by 15 min
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until : " + localTime1);

        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("Today is : " + localDate);
        System.out.println("Today is : " + localDate.getYear());
        System.out.println("Today is : " + localDate.getDayOfWeek());
        System.out.println("Today is : " + localDate.getDayOfYear());
        System.out.println("Week of the year is : " + ((localDate.getDayOfYear()/7) + 1));

        LocalDate localDate1 = LocalDate.of(2019,Month.DECEMBER,11);
        System.out.println("Covid dayZero : " + localDate1);

        //LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and time :  : " + localDateTime.withSecond(0).withNano(0));

        LocalDateTime firstIntCatDay = LocalDateTime.of(1997,11,20,10,45,0,0);
        System.out.println("First International Cats day : " + firstIntCatDay);
        System.out.println("First International Cats day : " + firstIntCatDay.getMonth().getValue()+ "."+ firstIntCatDay.getDayOfMonth());

        // Duration
        System.out.println(Duration.ofHours(3).toMinutes());
        System.out.println(Duration.between(LocalDateTime.now(),localDateTime.now().plusDays(2)).toHours());
        System.out.println(Duration.between(firstIntCatDay,localDateTime.now()).toDays());

        // Period
        System.out.println("Period 1 : " + Period.between(localDate.now(),LocalDate.now().plusDays(120)).getMonths());
        System.out.println("Period 2 : " + Period.between(localDate.now(),LocalDate.now().plusDays(350)).toTotalMonths());
        System.out.println("Period 3 : " + Period.between(localDate.now(),LocalDate.now().plusDays(350)).toTotalMonths());
        System.out.println("Period 4 : " + Period.between(localDate.now(),LocalDate.now().plusMonths(24)).getDays());
        System.out.println("Period 4 : " + Period.between(localDate.now(),LocalDate.now().plusMonths(24)).getYears());
        System.out.println("Period 5 : " + Period.between(localDate.now(),LocalDate.now().plusYears(20)).toTotalMonths());

    }
}

/*
public class DateAndTimeExamples {
    public static void main(String[] args) {

        // local time
        LocalTime localTime = LocalTime.now().withNano(0);
        System.out.println("Now its = " + localTime);
        System.out.println(localTime.getHour() + "/" +localTime.getMinute()+ "/" + localTime.getSecond());
        System.out.printf("%d/%d/%d\n",localTime.getHour(),localTime.getMinute(),localTime.getSecond());

        LocalTime localTime1 = localTime.now().withSecond(0).withNano(0);
        System.out.println(localTime1);

        // Increase localtime1 by 15 min
        localTime1 = localTime1.plusMinutes(15);
        System.out.println("Break until : " + localTime1);

        // local date

        LocalDate localDate = LocalDate.now();
        System.out.println("Today is : " + localDate);
        System.out.println("Year is : " + localDate.getYear());
        System.out.println("Day of the week : " + localDate.getDayOfWeek());
        System.out.println("Day of the year : " + localDate.getDayOfYear());
        System.out.println("Week of the year : " + (localDate.getDayOfYear()/7+ 1));

        LocalDate localDate1 = localDate.of(2019, Month.DECEMBER,11);
        System.out.println("Covid first case date was : " + localDate1);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + localDateTime );

        LocalDateTime firstInternationalCatsDay = localDateTime.of(1997,11,20,10,045,0,0);
        System.out.println("First International Cats Day was : " + firstInternationalCatsDay);
        System.out.println("First International Cats Day was : " + firstInternationalCatsDay.getMonth()+ "." + firstInternationalCatsDay.getDayOfMonth());
        System.out.println("First International Cats Day was : " + firstInternationalCatsDay.getMonth().getValue()+ "." + firstInternationalCatsDay.getDayOfMonth());

        //Duration
        System.out.println(Duration.ofHours(11).toMinutes());
        System.out.println(Duration.between(localDateTime.now(),LocalDateTime.now().plusDays(2)).toMinutes());
        System.out.println(Duration.between(firstInternationalCatsDay,localDateTime.now()).toDays());

        // Period
        System.out.println(Period.between(LocalDate.now(),LocalDate.now().plusDays(160)).getMonths());


    }
}
*/