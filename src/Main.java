public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        int year = 2000;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для iOS");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию приложения для Android");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
    }

    public static void task3() {

        int deliveryDistance = 59;
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


}