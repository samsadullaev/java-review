package functional_Interface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Examples {
    public static void main(String[] args) {

        // TODO : Predicate
//        Predicate<Integer> lesserThen=new Predicate<Integer>() {
//            //Animate class
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 18;
//            }
//        };

      //  lesserThen.test(50);


        Predicate<Integer> lesserThean= a -> a<18; //Implementation of test method that belongs to Predicate interface

        boolean test = lesserThean.test(50);
        System.out.println("test = " + test);


        // TODO : Consumer
        Consumer<Integer>display= i-> System.out.println(i);
       // Consumer<Integer>display= System.out::println;
        display.accept(50);


        // TODO : BiConsumer
        BiConsumer<Integer,Integer> addTwo= (x,y) -> System.out.println(x+y);
        addTwo.accept(100,200);


        //TODO Function
        Function<String,String>fun =  s ->"Hello "+s;
        String str = fun.apply("Abbos");
        System.out.println(str);

    }
}
