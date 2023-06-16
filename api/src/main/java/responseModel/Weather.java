package responseModel;

import groovy.transform.EqualsAndHashCode;
import lombok.Data;

@Data
@EqualsAndHashCode()
public class Weather {
    private int id;
    private String main;
    private String description;
    private String icon;
}
