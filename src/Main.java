import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("Task 1");
        int total = 2_459_000;
        int salaryMonth = 15_000;
        double sum = 0;
        int month = 1;
        double procent = 0.01;
        while ( sum < total ) {
            sum = (1 + procent) * sum;
            sum = sum + salaryMonth;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
        //task 2
        System.out.println("Task 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.println( number + " ");
        }
        System.out.println();



        //task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int fertilityPerThousand = 17;
        int mortalPerThousand = 8;
        int startYear = 2023;
        for (int year = startYear; year <= startYear + 10; year++) {
          population = population + fertilityPerThousand * population / 1000 - mortalPerThousand * population / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        //task 4
        System.out.println("Task 4 ");
        total = 12_000_000;
        sum = 15_000;
        procent = 0.07;
        month = 1;
        while (sum < total) {
            sum = sum + procent * sum;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            month++;
        }
        //task 5
        System.out.println("Task 5");
        sum = 15_000;
        month = 1;
        while (sum < total) {
            sum = sum + procent * sum;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
        //task 6
        System.out.println("Task 6");
        sum = 15_000;
        month = 1;
        int months = 12 * 9;
        while (month < months) {
            sum = sum + procent * sum;
            if (month % 6 == 0) {

                System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
            }
            month++;
        }
        //task 7
        System.out.println("Task 7");
        int firstFridayAtTheMonth = 1;
        for (int day = firstFridayAtTheMonth; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница " + day + "-е число. Необходимо подготовить отчет ");

        }
        //task 8
        System.out.println("Task 8");
        int period = 79;
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = 0; year <= end; year = year + period) {
            if (year >= start) {
                System.out.println(year);
            }
        }

    }
}
