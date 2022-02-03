package homework;

import java.util.Arrays;
import java.util.List;

public class DishDemo {
    public static void main(String[] args) {

        List<Dish>menu= Arrays.asList(
                new Dish("pork",false,800,Type.MEAT),
                new Dish("beef",false,700,Type.MEAT),
                new Dish("chicken",false,400,Type.MEAT),
                new Dish("fries",true,530,Type.Other),
                new Dish("rice",true,350,Type.Other),
                new Dish("fruit",true,120,Type.Other),
                new Dish("pizza",true,550,Type.Other),
                new Dish("prawns",true,300,Type.FISH),
                new Dish("salmon",true,450,Type.FISH)
        );
        //Print all dish's names that have less than 400 calories
        System.out.println("Dishes that have less than 400 calories:");
        menu.stream()
                .filter(each->each.getCalories()<400)
                .forEach(System.out::println);

        //Print the length of the name of each dish
        //1st way: with the Stream
        menu.stream().map(each->each.getName().length())
                .forEach(System.out::println);
        //2nd way: by using forEach()
        menu.forEach(each-> System.out.println("Length of each dish's name: "+ each.getName().length()));
    }
}
