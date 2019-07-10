import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaUsage {
    private static List<Apple>filter(List<Apple> source, Predicate<Apple> predicate){
        List<Apple> result = new ArrayList<>();
        for (Apple a:source

             ) {
            if(predicate.test(a))
                result.add(a);

        }
        return result;
    }

    public static void main(String[] args) {
        List<Apple> list = Arrays.asList(new Apple("green",120l),new Apple("red",150l));
        List<Apple> greenApples = filter(list, (apple -> apple.getColor().equals("green")));
        System.out.println(greenApples);

    }
}
