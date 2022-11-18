public class Main {
    public static void main(String[] args) {

//        Задача 1
        System.out.println("Задача 1");
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        System.out.println();

//        Задача 2 (вариант 1: без вложенных условных операторов)
        System.out.println("Задача 2 (вариант 1)");
        int clientOS1 = 0;
        int clientDeviceYear = 2014;

        if (clientOS1 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >=2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        System.out.println();

//        Задача 2 (вариант 2: с вложенными условными операторами)
        System.out.println("Задача 2 (вариант 2)");

        if (clientOS1 == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        } else {
            if (clientDeviceYear >=2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }
        System.out.println();


//        Задача 3
        System.out.println("Задача 3");
        int year = 1900;
        if ((year / 100) % 4 != 0 || year % 4 != 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год является високосным.");
        }
        System.out.println();


//        Задача 4
        System.out.println("Задача 4");
        int deliveryDistance = 40;
        int deliveryPeriod = 1;

        if (deliveryDistance < 20) {
            System.out.println("Доставка займет " + deliveryPeriod + " день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка займет " + (deliveryPeriod + 1) + " дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Доставка займет " + (deliveryPeriod + 1 + 1) + " дня.");
        } else {
            System.out.println("Доставка не осуществляется.");
        }
        System.out.println();

//        Задача 4 (вариант наставника)
        System.out.println("Задача 4 (вариант наставника)"); // нет ограничения 100 км и варианта, что доставка на определенное расстояние не осуществляется

        if (deliveryDistance >= 20) {
            deliveryPeriod ++;
        }
        if (deliveryDistance >= 60) {
            deliveryPeriod ++;
        }
        System.out.println("Доставка займет дней: " + (deliveryPeriod) + ".");
        System.out.println();

//        Задача 5
        System.out.println("Задача 5");
        int monthNumber = 1;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит сезону зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадлежит сезону весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит сезону лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Этот месяц принадлежит сезону осень.");
                break;
            default:
                System.out.println("Такого месяца не существует.");
        }
        System.out.println();
    }
}