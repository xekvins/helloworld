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
        if(kidAge1 < 5) {
            System.out.println("Если ребенку " + kidAge1 + " года то он не может кататься на аттракционе.");
        } else if(kidAge1 > 5 && kidAge1 < 14) {
            System.out.println("Если ребенку больше 5, но меньше 14 лет, то он может кататься в сопровождении взрослого, если взрослого нет - нельзя");
        } else {
            System.out.println("Если ребенок старше 14 лет, то он может кататься без сопровождения взрослого");

        }
        //Task#6
        System.out.println("Task 6 ");
        int capacity = 102;
        int numSeats = 60;
        int numPassengers = 75;

        if (numSeats > numPassengers) {
            System.out.println("В вагоне есть свободные сидячие места.");
        } else if (capacity > numPassengers) {
            System.out.println("В вагоне есть свободные стоячие места.");
        } else {
            System.out.println("В вагоне нет свободных мест.");
        }



        //Task#7
        System.out.println("Task 7 ");
        int one = 1;
        int two = 2;
        int three = 3;
        if ( one  >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
        }
    }

















