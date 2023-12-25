package pharmacy;

import org.jetbrains.annotations.NotNull;

public class Component implements Comparable<Component>{
    protected String name;
    protected String weight;
    protected int power;


    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", weight='" + weight + '\'' +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(@NotNull Component o) {
        return Integer.compare(0, this.name.compareTo(o.name));
    }
}
