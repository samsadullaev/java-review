import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class State {
    private String name;
    private List<String> cities = new ArrayList<>();

    public void addCity(String city){
        cities.add(city);
    }

    public List<String> getCity(){
        return this.cities;
    }
}
