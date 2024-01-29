public class Main {
    public static void main(String[] args) {
   //Task 1
        System.out.println("Task 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println();


        //Task 2
        System.out.println("Task 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName);


        //Task 3
        System.out.println("Task 3");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName);
    }
}
