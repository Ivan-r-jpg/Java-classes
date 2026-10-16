package org.example;

public class Clothes {
    private double price;
    private String brand;
    private String material;
    private String size;

    public Clothes(){}

    public Clothes(String brand, String material, String size, double price) {
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
}
