import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    public static void main(String[] args) {
//        YearMonth y1= YearMonth.of(2015, Month.SEPTEMBER);
//        YearMonth y2=YearMonth.of(2016,Month.FEBRUARY);
//        System.out.println(y1.minus(Period.ofMonths(4)).getMonthValue());
//        System.out.println(y1.until(y2, ChronoUnit.MONTHS));
//        System.out.println(y1.until(y2));
//        System.out.println(y2.compareTo(y1));
//        System.out.println(y2.until(y1,ChronoUnit.MONTHS));


//        Supplier<String> i = ()-> "Car";
//        Consumer<String> c =x -> System.out.println(x.toLowerCase());
//        Consumer<String> d =x -> System.out.println(x.toUpperCase());
//        c.andThen(d).accept(i.get());
//        System.out.println();



//        int c = 0;
//        System.out.println((0==c++)? "true":"false");
//        boolean b = false;
//        System.out.println(b=true);
//        String e ="1";
//        System.out.println(("1"!=e)?"true":"false");
        int a =0;
        System.out.println((a!=0)?"true":"false");
        Double d = null;
        System.out.println((d instanceof Double)?true:false);


    }
}
