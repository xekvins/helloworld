public class Main {
    public static void main(String[] args) {
        int salary = 65535;
        //Task 1
        System.out.println("Task 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        //Task 2
        System.out.println("Task 2");
        for (int d = 10; d > 0; d = d - 1) {
            System.out.println(d);
        }
        //Task 3
        System.out.println("Task 3");
        for (int w = 0; w < 17; w = w + 2) {
            System.out.println("Четное число " + w);
        }
        //Task 4
        System.out.println("Task 4");
        for (int t = -10; t < 10; t++) {
            System.out.println(t);
        }
        //Task 5
        System.out.println("Task 5");
        for (int v = 1904; v < 2096; v = v + 4) {
            System.out.println(v + " год является високосным");
        }
        //Task 6
        System.out.println("Task 6");
        for (int s = 7; s < 98; s += 7) {
            System.out.println(s);
        }
        //Task 7
        System.out.println("Task 7");
        for (int y = 1; y < 512; y = y * 2) {
            System.out.println(y);
        }
        //Task 8
        System.out.println("Task 8");
        int salaryYear = 29_000;
        int sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum = sum + salaryYear;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //Task 9
        System.out.println("Task 9");
        salaryYear = 29_000;
        sum = 0;
        for (int month = 1; month <= 12; month++) {
            sum = sum + sum / 100;
            sum = sum + salaryYear;
            System.out.println("Месяц " + month + " сумма накоплений равна " + sum + " рублей");
        }
        //Task 10
        System.out.println("Task 10");
        int two = 2;
        for ( int factor = 1; factor <= 10; factor++) {
            System.out.println(two + " х " + factor + " = " + factor * 2 );
        }
    }
}

