package problem4.models;

import java.util.Comparator;

public class Chocolate implements Comparable<Chocolate> {

    private String name;
    private double weight;

    public Chocolate(String name , double weight) {
        this.name = name;
        this.weight = weight;
    }


    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight , other.weight);
    }

    @Override
    public String toString() {
        return "Chocolate{name =  " + name + " weigth = " + weight + "}";
    }

}
