import javax.naming.ldap.PagedResultsResponseControl;
import java.util.Arrays;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("Task 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;


        //
        double [] numberSecond = {1.57, 7.654, 9.986};


        //
        int [] numberThird = new int[12];
        numberThird[0] = 938;
        for (int i = 0; i < numberThird.length; i++) {

        }
        System.out.println(Arrays.toString(numberThird));


        System.out.println();
        //Task 2
        System.out.println("Task 2");
        for (int i = 0; i < number.length; i++) {
        }
        System.out.println(Arrays.toString(number));


        for (int i = 0; i < numberSecond.length; i++) {

        }
        System.out.println(Arrays.toString(numberSecond));


        numberThird[0] = 938;
        for (int i = 0; i < 12; i++) {


        }
        System.out.println(Arrays.toString(numberThird));

        System.out.println();

        //Task 3
        System.out.println("Task 3");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.println(number[i]);
        }
        System.out.println();




        for (int i = numberSecond.length - 1; i >=0; i--) {
            System.out.println(numberSecond[i]);
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0 ) {
                number[i]++;
                System.out.println(number[i]);

            }
        }


            System.out.println(number[1]);



    }
}
