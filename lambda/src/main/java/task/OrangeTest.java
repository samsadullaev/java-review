package task;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {

    public static void main(String[] args) {
        List<Orange>inventory=new ArrayList<>();
        inventory.add(new Orange(300,Color.GREEN));
        inventory.add(Orange.builder().weight(200).color(Color.GREEN).build());
      //  inventory.add(Orange.builder().weight(200).build()); // We can skip the constructor value
        inventory.add(Orange.builder().weight(500).color(Color.RED).build());
        inventory.add(Orange.builder().weight(300).color(Color.GREEN).build());
    }



    private static void prettyPrintApple(List<Orange> inventory,OrangeFormatter orangeFormatter){
        for(Orange orange : inventory){
            String output = orangeFormatter.accept(orange);
            System.out.println(output);
        }
    }
}
