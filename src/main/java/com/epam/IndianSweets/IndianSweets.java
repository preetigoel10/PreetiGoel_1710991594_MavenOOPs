package com.epam.IndianSweets;

public class IndianSweets implements Comparable<IndianSweets>{
    private String name;
    private float cost;
    private float weight;

    public IndianSweets(String name, float cost, float weight) {
        this.name = name;
        this.cost = cost;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(IndianSweets indianSweets) {
        if (indianSweets.cost < cost) {
            return -1;
        } else if (indianSweets.cost > cost) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", Cost=" + cost +
                ", Weight=" + weight;
    }
}

