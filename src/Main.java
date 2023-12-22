public class Main {
    public static void main(String[] args) {
        // Task#1
        System.out.println("Задача 1");
      var dog = 8.0;
      System.out.println(dog);
      var cat = 3.6;
      System.out.println(cat);
      var paper = 763789;
      System.out.println(paper);

        // Task#2
      System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // Task#3
      System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);
        // Task#4
      System.out.println("Задача 4");
      var friend = 19;
      friend = friend + 2;
      System.out.println(friend);
      friend = friend / 7;
      System.out.println(friend);
      // Task#5
      System.out.println("Задача 5");
      var frog = 3.5;
      System.out.println(frog);
      frog = frog * 10;
      System.out.println(frog);
      frog = frog / 3.5;
      System.out.println(frog);
      frog = frog + 4;
      System.out.println(frog);
      // Task#6
      System.out.println("Задача 6");
      var boxer1 = 78.2;
      var boxer2 = 82.7;
      var total = boxer1 + boxer2;
      System.out.println(total);
      var differenceInMass = boxer2%boxer1;
      System.out.println(differenceInMass);
      // Task#7
      System.out.println("Задача 7");
      var vasyaWeight = 70;
      var tolyaWeight = 89;
      System.out.println("Разница в весе " + tolyaWeight%vasyaWeight + " kg");
      // Task#8
      System.out.println("задача 8");
      var workHours = 640;
      var onePersonHoursForWork = 8;
      var numberOfEmployees = workHours / onePersonHoursForWork;
      System.out.println("Всего работников в компании - " + numberOfEmployees + " человек" );
      var plusEmployees = 94;
      var updateEmployees = numberOfEmployees + plusEmployees;
      updateEmployees = updateEmployees * 8;
      System.out.println("Если в компании работает на " + plusEmployees + " человек больше, то всего получается " + updateEmployees + " часов работы может быть поделено между сотрудниками");



    }

}