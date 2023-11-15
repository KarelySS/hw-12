public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        checkYear(2021);
        //Задача 2
        System.out.println("Задача 2");
        checkDevice(1, 2013);
        //Задача 3
        System.out.println("Задача 3");
        int deliveryDistance=95;
        System.out.println("Потребуется дней: "+ deliverCard(deliveryDistance));
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }
    }

    public static void checkDevice(int OS, int clientDeviceYear) {
        int ios = 1;
        int android = 0;
        boolean condition = clientDeviceYear > 2015;
        if (OS == ios && condition) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (OS == ios && !condition) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }
        if (OS == android && (condition)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (OS == android && !condition) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static int deliverCard(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            return 3;
        } else {
            System.out.println("Доставка не осуществляется");
        }
        return deliveryDistance;
    }
}