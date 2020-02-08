package com.epam.Chocolates;

public class brandedChocolates implements Comparable<brandedChocolates>{
    private String brand_name;
    private float MRP;
    private float weight;

    public brandedChocolates(String brand_name, float MRP, float weight) {
        this.brand_name = brand_name;
        this.MRP = MRP;
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(brandedChocolates chocolates) {
        if (chocolates.MRP < MRP) {
            return -1;
        } else if (chocolates.MRP > MRP) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Brand Name='" + brand_name + '\'' +
                ", MRP=" + MRP +
                ", weight=" + weight;
    }
}
