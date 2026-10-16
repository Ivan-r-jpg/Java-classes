package org.example;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть кількість об'єктів, що бажаєте створити: ");
        int count = Integer.parseInt(sc.nextLine());
        while(count <= 0) {
            System.out.print("\n[ПОМИЛКА] - Введено неправильне число ("
                    + count + " < 0)!\nВведіть ще раз кількість об'єктів, що бажаєте створити: ");
            count = Integer.parseInt(sc.nextLine());
        }

        Clothes[] clothesArr =  new Clothes[count];

        for (int i = 0; i < clothesArr.length; i++) {
            System.out.println("\nОдяг під номером " + (i+1) + ":");
            boolean status = false; // Змінна-флаг для керування циклом while
            while (!status) {
                try {
                    System.out.print("\nНазвіть бренд одягу: ");
                    String brand = sc.nextLine();
                    System.out.print("Оберіть розмір одягу ('S', 'M', 'L' або власне значення): ");
                    String size = sc.nextLine();
                    System.out.print("Вкажіть матеріал з чого вироблений одяг: ");
                    String material = sc.nextLine();
                    System.out.print("Назвіть ціну даного одягу ($): ");
                    double price = Double.parseDouble(sc.nextLine());

                    clothesArr[i] = new Clothes(brand, material, size, price);
                    System.out.println("\n[УВАГА] - Об'єкт класу Clothes успішно створено!");
                    status = true;
                }
                catch(NullPointerException e){
                    System.out.println("\n[ПОМИЛКА] - Введено значення null у поле об'єкта!");
                }
                catch(NumberFormatException e){
                    System.out.println("\n[ПОМИЛКА] - Введено нечислове значення!");
                }
                catch(IllegalArgumentException e){
                    System.out.println("\n[ПОМИЛКА] - " + e.getMessage());
                }
            }
        }
        System.out.println("\n[УВАГА] - Всі об'єкти успішно створено!");
        int iter = 1; // Змінна для підрахунку номера поточної ітерації виведення результатів
        System.out.println("\nРЕЗУЛЬТАТИ");
        for (Clothes cl : clothesArr){
            System.out.println("\nОдяг №" + iter + ":");
            System.out.println(cl);
            iter ++;
        }
        sc.close();
    }
}
