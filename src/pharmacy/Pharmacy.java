package pharmacy;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Pharmacy implements Iterator<Component>, Copmparable<Pharmacy> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component ... components){
        if (components.length == 0) System.out.println("Вы ничего не добавили!");
        else Collections.addAll(this.components, components);

    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, components);
    }

    @Override
    public int compareTo(@NotNull Component o) {
        return Copmparable.super.compareTo(o);
    }

    @Override
    public Component next() {
        //component c = components.get(index);
        //index++;
        //return c;
        return components.get(index++);


    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Pharmacy pharmacy = (Pharmacy) o;
//        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(index, components);
//    }
}
