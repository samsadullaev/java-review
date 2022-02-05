package stream;

import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        String[]names={"John","Peter","Susan","Kim","Jen","George","Alam","Stacy","Michelle","john"};

        //Display the first four names sorted
        Stream.of(names)
                .limit(4)
                .sorted()
                .forEach( each ->System.out.print(each +" "));

        //Skip four names and display the rest sorted ignore casee
        System.out.println();
        System.out.println("***************");
        Stream.of(names).skip(4).sorted( (e1,e2)-> e1.compareToIgnoreCase(e2)).forEach( each ->System.out.print(each +" "));
        System.out.println();

        System.out.println("***************");
        Stream.of(names).skip(4).sorted(String::compareToIgnoreCase).forEach(each ->System.out.print(each +" "));
        System.out.println();

        System.out.println("\nLargest string with length >4: "+
                Stream.of(names).filter(name-> name.length() >4).max(String::compareTo).get());

        System.out.println("\nSmallest string with alphabetically: "+
                Stream.of(names).min(String::compareTo).get());
    }
}
