package org.example;

import java.util.Objects;

/**
 * Клас Clothes описує одяг.
 * Містить приватні поля: ціна, бренд, матеріал, розмір, кількість на складі.
 * Містить сетери та гетери по всім полям.
 * Містить порожній та конструктор з параметрами.
 * Містить перевизначені методи: toString() та equals(Object o).
 */
public class Clothes {
    private double price;
    private String brand;
    private String material;
    private String size;
    private int quantity;

    /**
     * Порожній конструктор.
     * ПОтрібний для того аби швидко створити порожній екземпляр класу.
     */
    public Clothes(){}

    /**
     * Конструктор з параметрами.
     * Містить аргументи:
     * @param brand
     * @param material
     * @param size
     * @param price
     * @param quantity
     */
    public Clothes(String brand, String material, String size, double price, int quantity) {
        setBrand(brand);
        setMaterial(material);
        setSize(size);
        setPrice(price);
        setQuantity(quantity);
    }

    /**
     * Гетер для повернення значення ціни об'єкта.
     * @return this.price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Сетер для встановлення значення ціни в об'єкт.
     * Всередині методу виконується перевірка на коректність внесеного значення.
     * Якщо встановлена ціна менше нуля, то метод кине виняток типу IllegalArgumentException.
     * @param price
     */
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Ціна не може бути менше нуля!");
        }
        this.price = price;
    }

    /**
     * Гетер для повернення значення назви бренду об'єкта.
     * @return this.brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Сетер для встановлення значення назви бренду в об'єкт.
     * Всередині методу виконується перевірка на коректність внесеного значення.
     * Якщо встановлений бренд має порожнє або null значення, то метод кине виняток типу IllegalArgumentException.
     * @param brand
     */
    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле brand має бути заповненим!");
        }
        this.brand = brand;
    }

    /**
     * Гетер для повернення значення назви матеріалу об'єкта.
     * @return this.material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Сетер для встановлення значення назви матеріалу в об'єкт.
     * Всередині методу виконується перевірка на коректність внесеного значення.
     * Якщо встановлений матеріал має порожнє або null значення, то метод кине виняток типу IllegalArgumentException.
     * @param material
     */
    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле material має бути заповненим!");
        }
        this.material = material;
    }

    /**
     * Гетер для повернення значення розміру об'єкта.
     * @return this.size
     */
    public String getSize() {
        return size;
    }

    /**
     * Сетер для встановлення значення розміру в об'єкт.
     * Всередині методу виконується перевірка на коректність внесеного значення.
     * Якщо встановлений розмір має порожнє або null значення, то метод кине виняток типу IllegalArgumentException.
     * @param size
     */
    public void setSize(String size) {
        if (size == null || size.trim().isEmpty()) {
            throw new IllegalArgumentException("Поле size має бути заповненим!");
        }
        this.size = size;
    }

    /**
     * Гетер для повернення значення кількості залишків об'єкта.
     * @return this.quantity
     */
    public int getQuantity() { return quantity; }

    /**
     * Сетер для встановлення значення кількості залишків в об'єкт.
     * Всередині методу виконується перевірка на коректність внесеного значення.
     * Якщо встановлене значення менше нуля, то метод кине виняток типу IllegalArgumentException.
     * @param quantity
     */
    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Кількість товару не може бути менше нуля!");
        }
        this.quantity = quantity;
    }

    /**
     * Перевизначений метод toString().
     * Повертає опис об'єкта типу Clothes.
     * @return String
     */
    @Override
    public String toString(){
        return "\nЦіна одягу: " + this.price + "\nБренд одягу: "
                + this.brand + "\nМатеріал: " + this.material
                + "\nРозмір: " + this.size
                + "\nКількість на складі: " + this.quantity;
    }

    /**
     * Перевизначений метод equals(Object o).
     * Містить параметр - об'єкт, з яким порівнюється об'єкт класу.
     * Метод повертає true або false: true - якщо два об'єкти однакові, або false - якщо вони різні.
     * @param o   the reference object with which to compare.
     * @return true або false
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return (this.price == clothes.price) && (Objects.equals(this.brand, clothes.brand))
                && (Objects.equals(this.material, clothes.material))
                && (Objects.equals(this.size, clothes.size))
                && (this.quantity == clothes.quantity);
    }
}
