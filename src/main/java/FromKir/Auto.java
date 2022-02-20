package FromKir;

import java.util.Objects;

public class Auto {


    private String name;
    private Integer year;
    private Double cost;
    private String color;
    private Double volume;

        public Auto(String name, Integer year, Double cost, String color, Double volume) {
            this.name = name;
            this.year = year;
            this.cost = cost;
            this.color = color;
            this.volume = volume;
        }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public Double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(name, auto.name) && Objects.equals(year, auto.year) && Objects.equals(cost, auto.cost) && Objects.equals(color, auto.color) && Objects.equals(volume, auto.volume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year, cost, color, volume);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", volume=" + volume +
                '}';
    }
}
