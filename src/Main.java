import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        //
        double [] numberSecond = {1.57, 7.654, 9.986};
        System.out.println(numberSecond[0]);
        System.out.println(numberSecond[1]);
        System.out.println(numberSecond[2]);


        //
        int [] numberThird = new int[12];
        numberThird[0] = 938;
        for (int i = 0; i < 12; i++) {
            System.out.println(numberThird[i]);


        }

        //Task 2
        System.out.println("Task 2");
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);


        System.out.println(numberSecond[0]);
        System.out.println(numberSecond[1]);
        System.out.println(numberSecond[2]);




        numberThird[0] = 938;
        for (int i = 0; i < 12; i++) {
            System.out.println(numberThird[i]);


        }

        //Task 3
        System.out.println("Task 3");
        System.out.println(number[2]);
        System.out.println(number[1]);
        System.out.println(number[0]);



        System.out.println(numberSecond[2]);
        System.out.println(numberSecond[1]);
        System.out.println(numberSecond[0]);


        //Task 4
        System.out.println("Task 4");
        int [] arr = {2, 4, 6, 8, 10, 12, 14};
        System.out.println(Arrays.toString(arr));
    }
}
