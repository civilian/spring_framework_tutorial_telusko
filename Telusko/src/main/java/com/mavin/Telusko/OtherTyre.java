package com.mavin.Telusko;

public class OtherTyre{
    private String brand;

    public OtherTyre(String brand){
        super();
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Tyre [brand=" + brand + "]";
    }
}