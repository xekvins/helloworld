import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task3();

        System.out.println("TAsk 1");
        // Задание 1
        int currentYear = 2021;
        boolean isLeapYear = false;

        isLeapYear = isLeap(currentYear);

        if (isLeapYear) {
            System.out.println("Год " + currentYear + " високосный");
        } else {
            System.out.println("Год " + currentYear + " не високосный");
        }

        // Задание 2
        versionSelector();
    }

    static boolean isLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0)) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    //Задание 3
    public static int checkersDistanceDay (int deliveryDistance) {
        int deliveryDay = 1;
        if (deliveryDistance > 20) {
            deliveryDay++;
        }
        if (deliveryDistance > 60) {
            deliveryDay++;
        }
        if (deliveryDistance > 100) {
            deliveryDay++;
        }
        return deliveryDay;
    }


    public static void versionSelector() {
        System.out.println();
        System.out.println("Task 2");
        int currentYear = LocalDate.now().getYear();
        System.out.print("Год выпуска вашего устройства " + currentYear);
        int deviceYear = 2015;
        if (deviceYear % 2 != 0) {
            System.out.println(". Похоже, у вас Android-устройство " + deviceYear + "-го года, если ваше устройство старше текущего года, мы рекомендуем установить облегченную версию");

        } else {
            System.out.println(". Похоже, у вас iOS-устройство " + deviceYear + "-го года, если ваше устройство старше текущего года, мы рекомендуем установить облегченную версию");
        }
        System.out.println();

        System.out.println("Task 3");

        }

    public static void task3() {


            System.out.println("Задача 3");
            int deliveryDistance = 101;
            int deliveryDay = checkersDistanceDay(deliveryDistance);
            if (deliveryDay > 3) {
                System.out.println("Доставка свыше 100 км не действует");
            } else {
                System.out.println("Потребуется для доставки дней: " + deliveryDay);
            }
        }
    }





