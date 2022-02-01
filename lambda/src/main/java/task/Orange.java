package task;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@ToString
//@Getter
//@Setter
@Builder  //@Builder generate all @AllArgsConstructor unless there is other @XArgsConstructor
//@Data
public class Orange {

    private int weight;
    private Color color;
}
