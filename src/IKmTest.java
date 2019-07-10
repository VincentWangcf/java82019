import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Stream;

public class IKmTest {
    public static void main(String[] args) throws IOException {
//        Calendar cal = Calendar.getInstance();
//        cal.set(2000,Calendar.AUGUST,30);
//        cal.roll(Calendar.MONTH,7);
//        System.out.println(""+cal.get(Calendar.DATE)+ "-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
//        cal.add(Calendar.MONTH,11);
//        System.out.println(""+cal.get(Calendar.DATE)+"-"+cal.get(Calendar.MONTH)+"-"+cal.get(Calendar.YEAR));
//        LocalDate date =LocalDate.of(2000, Month.AUGUST,30);
//        date.plusMonths(6);
//        System.out.println(""+date.getDayOfMonth()+"-"+date.getMonthValue()+"-"+date.getYear());





//        System.out.println(Stream.of("green","yellow","blue").max((s1,s2)->s1.compareTo(s2)).filter(s->s.endsWith("n")).orElse("yellow"));

        File file = new File("sss");
        FileWriter output  = new FileWriter(file);








        output.flush();













    }
}
