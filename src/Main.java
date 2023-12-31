public class Main {
    public static void main(String[] args) {

        //Task1
        System.out.println("Task 1" );
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientOS == 1) {
                System.out.println("Установите версию плиложения для Android по ссылке");
            }

        } else {
            System.out.println("Неизвестная ОС");
        }

            //Task 2
            System.out.println("Task 2 ");
            int clientDeviceYear = 2015;
            int clientOS2 = 1;
            if (clientDeviceYear < 2015 && clientOS2 == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientDeviceYear > 2015 && clientOS2 == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (clientDeviceYear < 2015 && clientOS2 == 1) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else if (clientDeviceYear > 2015 && clientOS2 == 1) {
                System.out.println("Устоновите версию приложения для Android по ссылке");
            } else {
                System.out.println("Что ты купил, черт возьми??!!!!");
            }

            //Task 3
        System.out.println("Task 3");
        int year = 2021;
        if (( year % 4 == 0) || (year % 4 == 0) && (year % 100 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("Task 4");
        int deliveryDistance = 95;
        int deliveryDays = 3;
        if (deliveryDistance <= 20 && deliveryDays == 1) {
            System.out.println("Потребуется дней: " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60 && deliveryDays == 2) {
            System.out.println("Потребуется дней: " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100 && deliveryDays == 3) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Доставки нет");
        }
        //Task 5
        System.out.println("Task 5");
        char monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("За пределами сезонов");
        }

        }

    }
