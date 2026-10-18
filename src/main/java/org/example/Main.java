package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Головний клас програми.
 * Містить метод main().
 */
public class Main {
    /**
     * Метод main() виконує функцію консольного меню програми.
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isProgramRunning = true;
        List<Clothes> clothesArr = new ArrayList<Clothes>();
        while(isProgramRunning){
            System.out.println("\nЛаскаво просимо у меню програми (Оберіть одну з наступних дій):" +
                    "\n1 - Створити новий об'єкт;" +
                    "\n2 - Вивести інформацію про всі об'єкти;" +
                    "\n3 - Завершити роботу.\n");
            System.out.print("-> Введіть ваш вибір: ");
            String choice = sc.nextLine().trim();
            while(choice.isEmpty())
            {
                System.out.print("\n[ПОМИЛКА] - Вибір не може бути порожнім!\nВведіть ваш вибір: ");
                choice = sc.nextLine().trim();
            }
            switch(choice){
                case "1":
                        System.out.println("\nОдяг під номером " + (clothesArr.size() + 1) + ":");
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
                                System.out.print("Введіть кількість даного одягу на складі: ");
                                int quantity = Integer.parseInt(sc.nextLine());

                                clothesArr.add(new Clothes(brand, material, size, price, quantity));
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
                    break;
                    case "2":
                        if(clothesArr.isEmpty()){
                            System.out.println("\n[ПОМИЛКА] - Не можна вивести всі об'єкти, адже ще не створено жодного!");
                        }
                        else {
                            int iter = 1; // Змінна для підрахунку номера поточної ітерації виведення результатів
                            System.out.println("\nСписок створених об'єктів:");
                            for (Clothes cl : clothesArr) {
                                System.out.println("\nОдяг №" + iter + ":");
                                System.out.println(cl);
                                iter++;
                            }
                        }
                        break;
                case "3":
                    System.out.println("\n[УВАГА] - Завершення роботи програми...");
                    isProgramRunning = false;
                    break;
                    default:
                        System.out.println("[УВАГА] - Оберіть один із варіантів виконання програми! (1 або 2 або 3)");
                        break;
            }
        }
        sc.close();
    }
}
