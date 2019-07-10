import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class java8 {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("abc", "bc", "efc", "abcd", "jkl");
//        strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
//        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
//
//
//        List<String> string=strings.parallelStream().filter(s -> s.length() > 2).collect(Collectors.toList());
//        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//        System.out.println("max"+stats.getMax());
//        System.out.println("min"+stats.getMin());
//        System.out.println("sum"+stats.getSum());
//        System.out.println("count"+stats.getCount());
        //intStream.
        Runnable r1 =()-> System.out.println("hellow");
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        };
        process(r1);
        process(r2);
        process(()-> System.out.println("hellow...."));

            }

    private static void process(Runnable r1) {
        r1.run();
    }

}

