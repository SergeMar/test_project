package responseModel;

import groovy.transform.EqualsAndHashCode;
import lombok.Data;

import java.util.List;

@Data
@EqualsAndHashCode()
public class WeatherModel {
    public Coord coord;
    public List<Weather> weather;
    public String base;
    public Main main;
    public int visibility;
    public Wind wind;
    public Clouds clouds;
    public int dt;
    public Sys sys;
    public int timezone;
    public int id;
    public String name;
    public int cod;
}
