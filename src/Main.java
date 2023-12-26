public class Main {
    public static void main(String[] args) {

        //Task#1
        System.out.println(" Task 1");
        int age = 19;
        if (age > 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        //Task#2
        System.out.println(" Task 2 ");
        int temp = 8;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        //Task#3
        System.out.println(" Task 3 ");
        int carSpeed = 56;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно едить спокойно");
        }
        //Task#4
        System.out.println("Task 4 ");
        int age1 = 4;

        if (age1 >= 2 && age1 < 6) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в детский сад.");

        } else if (age1 >= 7 && age1 < 17) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в школу. ");
        }

        if (age1 >= 18 && age1 < 24) {

            System.out.println("Если возраст человека равен " + age1 + ", то ему нужно ходить в универ. ");
        }

        if (age1 > 24) {
            System.out.println("Если возраст человека равен " + age1 + ", то ему пора ходить на работу");
        }
        //Task#5
        System.out.println(" Task 5 ");
        int kidAge1 = 4;
        if (kidAge1 < 5) {
            System.out.println("Если возраст ребенка равен " + kidAge1 + ", то ему нельзя кататься на аттракционе");
        } else {
            System.out.println("Если возраст ребенка больше " + 14 + ", то ему можно кататься на аттракционе ");
        }
        if (kidAge1 > 5 && kidAge1 < 14) {
            System.out.println("Если возраст ребенка равен " + kidAge1 + ", то ему можно кататься в сопровождении взрослого.");
        } else {
            System.out.println("Если возраст ребенка равен " + 16 + ", то ему можно кататься на аттракционе");
        }

        if (kidAge1 > 14) {
            System.out.println("Если возраст ребенка равен " + kidAge1 + ", то ему можно кататься на аттракционе");
        }
        //Task#6
        System.out.println("Task 6 ");
        int trainCapacity = 102;
        int seatPlace = 60;
        if (trainCapacity >= 0 && trainCapacity <= 100) {
            System.out.println(trainCapacity + " в вагоне есть места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        if (seatPlace >= 0 && seatPlace <= 59) {
            System.out.println("Если количество мест " + seatPlace + " то есть место");
        } else {
            System.out.println("В вагоне нет мест для сидения, но есть места для стоячих");
        }
        if (trainCapacity == 102) {
            System.out.println("Вагон полностью забит");
        }
        //Task#7
        System.out.println(" Task 7 ");

        int one = 1;
        int two = 2;
        int three = 3;
        if (two > one) {
            System.out.println(two + " больше чем " + one);
        } else {
            System.out.println(one + " больше чем " + two);
        }
        if (three > two) {
            System.out.println(three + " больше чем " + two);
        }
    }
}













