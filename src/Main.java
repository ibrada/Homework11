import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void defineLeapYear(int year) {
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void selectVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для iOS");
        } else if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (clientOS == 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
    }

    public static void determineDays(int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else {
            if (deliveryDistance < 20) {
                System.out.println("Потребуется " + deliveryDay + " день");
            }
            if (deliveryDistance > 20 && deliveryDistance < 60) {
                System.out.println("Потребуется " + (deliveryDay + 1) + " дня");
            }
            if (deliveryDistance > 60) {
                System.out.println("Потребуется " + (deliveryDay + 2) + " дня");
            }
        }
    }

    public static void task1() {
        defineLeapYear(2020);
    }

    public static void task2() {
        selectVersion(1, 2023);
    }

    public static void task3() {
        determineDays(95);
    }
}