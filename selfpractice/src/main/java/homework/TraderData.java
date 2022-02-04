package homework;

import java.util.stream.Stream;

public class TraderData {

    public static Stream<Trader> getAll(){
        return Stream.of(
                new Trader("Raoul","Cambridge"),
                new Trader("Mario","Milan"),
                new Trader("Mario","Milan"),
                new Trader("Brian","Cambridge")
        );
    }
}
