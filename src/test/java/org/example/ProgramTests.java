package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProgramTests {

    @Test
    public void setterExceptionTest(){
        Clothes clothes = new Clothes();
        assertThrows(IllegalArgumentException.class, () -> {clothes.setBrand(null);});
    }

    @Test
    public void constructorExceptionTest() {
        IllegalArgumentException exMaterial = assertThrows(IllegalArgumentException.class, () -> {
            new Clothes("Zoho", null, null, -2, -10);
        });
        assertEquals("Поле material має бути заповненим!", exMaterial.getMessage());

        IllegalArgumentException exSize = assertThrows(IllegalArgumentException.class, () -> {
            new Clothes("Zoho", "Синтетика", null, -2, -10);
        });
        assertEquals("Поле size має бути заповненим!", exSize.getMessage());

        IllegalArgumentException exPrice = assertThrows(IllegalArgumentException.class, () -> {
            new Clothes("Zoho", "Синтетика", "S", -2, -10);
        });
        assertEquals("Ціна не може бути менше нуля!", exPrice.getMessage());

        IllegalArgumentException exQuantity = assertThrows(IllegalArgumentException.class, () -> {
            new Clothes("Zoho", "Синтетика", "S", 25, -10);
        });
        assertEquals("Кількість товару не може бути менше нуля!", exQuantity.getMessage());
    }

    @Test
    public void constructorTest(){
        Clothes clothes = new Clothes("Nike", "Шовк", "M", 100, 10);
        assertEquals("Nike", clothes.getBrand());
        assertEquals("Шовк", clothes.getMaterial());
        assertEquals("M", clothes.getSize());
        assertEquals(100, clothes.getPrice());
        assertEquals(10, clothes.getQuantity());
    }

    @Test
    public void objectsTest(){
        Clothes clothes1 = new Clothes("Zara", "Конопля", "S", 95, 0);
        Clothes clothes2 = new Clothes("Zara", "Конопля", "S", 95, 0);
        assertEquals(clothes1, clothes2);
        Clothes clothes3 = new Clothes("Adidas", "Льон", "L", 95, 0);
        assertNotEquals(clothes3, clothes1);
    }
}
