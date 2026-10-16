package org.example;

import java.util.Objects;

public class Clothes {
    private double price;
    private String brand;
    private String material;
    private String size;

    public Clothes(){}

    public Clothes(String brand, String material, String size, double price) {
        setBrand(brand);
        setMaterial(material);
        setSize(size);
        setPrice(price);
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути менше нуля!");
        }
        this.price = price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        Objects.requireNonNull(brand, "Бренд не може бути null!");
        if (brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле brand має бути заповненим!");
        }
        this.brand = brand;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        Objects.requireNonNull(material, "Матеріал не може бути null!");
        if (material.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле material має бути заповненим!");
        }
        this.material = material;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        Objects.requireNonNull(size, "Розмір не може бути null!");
        if (size.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле size має бути заповненим!");
        }
        this.size = size;
    }

    @Override
    public String toString(){
        return "\nЦіна одягу: " + this.price + "\nБренд одягу: "
                + this.brand + "\nМатеріал: " + this.material
                + "\nРозмір: " + this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return (this.price == clothes.price) && (Objects.equals(this.brand, clothes.brand))
                && (Objects.equals(this.material, clothes.material))
                && (Objects.equals(this.size, clothes.size));
    }
}
