import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FilterApple {
    public interface AppleFilter{
        boolean filter(Apple apple);
    }
    public static List<Apple> findApple(List<Apple>apples,AppleFilter appleFilter){
        List<Apple> list =new ArrayList<>();
        for (Apple a:
             apples) {
            if(appleFilter.filter(a)){
                list.add(a);
            }
        }
        return list;
    }
    public static class GreenAnd150WeightFilter implements AppleFilter{

        @Override
        public boolean filter(Apple apple) {
            return ( apple.getColor().equals("green")&& apple.getWeight()>140);
        }
    }
    public static List<Apple> findGreenApple(
            List<Apple> apples){
        List<Apple> list= new ArrayList<Apple>();
        for (Apple a:
             apples) {
            if("green".equals(a.getColor()))
                list.add(a);


        }
        return list;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Apple> list =Arrays.asList(new Apple("green",150l),new Apple("yellow",170l),new Apple("red",150l));
        //List<Apple> list1 = Arrays.asList(new Apple("green", 120L), new Apple("red", 150L));150l
//        List<Apple> greenApple = findGreenApple(list);

//        assert greenApple.size()==9;
//        GreenAnd150WeightFilter greenAnd150WeightFilter = new GreenAnd150WeightFilter();
//
//        List<Apple> apple = findApple(list, new GreenAnd150WeightFilter());
//
//        System.out.println(apple);
//
//        String s = new String ("hello");
//        Function<Integer,Character> s1=s::charAt;
//        Character c2 = s1.apply(4);
//        System.out.println(c2);
            Supplier<String> supplier=String::new;
        String s = supplier.get();
        System.out.println(s);
        BiFunction<String,Long,Apple> appleBiFunction= Apple::new;
        Apple apple = appleBiFunction.apply("red", 100l);
        System.out.println(apple);


    }
}
