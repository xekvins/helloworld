
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
    }



    public static void task2() {
        System.out.println("Task 2");
        int[] arr = generateRandomArray();
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        int min = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println();}

    public static void task3(){
        System.out.println("Task 3");
        int[] arr = generateRandomArray();
        double averageSpend = 0;
        for (int i = 0; i < arr.length; i++) {
            averageSpend += arr[i];
            averageSpend /= arr.length;
        }
        System.out.println("Средняя сумма трат за месяц: " + averageSpend + " рублей");

    }

        public static void task4(){
            System.out.println("Task4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length-1; i >=0 ; i--) {
                System.out.print(reverseFullName[i]);
            }


    }
}
