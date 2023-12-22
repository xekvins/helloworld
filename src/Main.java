public class Main {
    public static void main(String[] args) {
      //Task#1
      System.out.println("Задача 1");
      byte Alpha = 10;
      short Beta = 129;
      int Gamma = 2782;
      long Delta = 20332l;
      float Goro = 2.345f;
      double deadInside = 4.4657234;
      System.out.println("Значение переменной " + "Alpha " + "с типом " + "byte " + "равно " + Alpha);
        System.out.println("Значения переменной " + " Beta " + "с типом " + "short " + "равно " + Beta);
        System.out.println("Значение с переменной " + "Gamma " + "с типом " + "int " + "равно " + Gamma);
        System.out.println("Значение переменной " + "Delta " + "с типом " + "long " + "равно " + Delta);
        System.out.println("Значение переменной " + "Goro " + "с типом " + " float " + "равно " + Goro);
        System.out.println("Значение с переменной " + "deadInside " + "c типом " + " double " + "равно " + deadInside);

        //Task#2
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987_678_965_549l;
        double c = 2.786;
        int d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;

        //Task#3
      System.out.println("Задача 3");
        byte teacherPavlovna = 23;
        byte teacherSergeevna = 27;
        byte teacherAndreevna = 30;
        int paperForOneStudent = 480 / (teacherAndreevna + teacherPavlovna + teacherSergeevna);
      System.out.println("На каждого ученика рассчитано " + paperForOneStudent + " листов бумаги");

      //Task#4
      System.out.println("Задача 4");
      byte bottleMachine = 16;
      byte timeMinute = 2;
      int twentyMinutes = 20 / timeMinute * bottleMachine;
      System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок");
      int oneDay = 1440 / timeMinute * bottleMachine;
      System.out.println("За одни сутки машина произвела " + oneDay + " штук бутылок");
      int threeDay = 1440 * 3 / timeMinute * bottleMachine;
      System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
      int oneMonth = 1440 * 30 / timeMinute * bottleMachine;
      System.out.println("За месяц машина произвела " + oneMonth + " штук бутылок");

      //Task#5
      System.out.println("Задача 5");
      byte allPaints = 120;
      byte whitePaintForOneClass = 2;
      byte brownPaintForOneClass = 4;
      int forOneClass = whitePaintForOneClass + brownPaintForOneClass;
      int classes = allPaints / forOneClass;
      int brownPaint = classes * brownPaintForOneClass;
      int whitePaint = classes * whitePaintForOneClass;
      System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

      //Task#6
      System.out.println("Задача 6");
      int bananas = 5;
      int oneBananaWeight = 80;
      int milk = 200;
      int milkPortionInOneHundredGramm = 105;
      int iceCream = 2;
      int oneIceCreamWeight = 100;
      int eggs = 4;
      int oneEggWeight = 70;
      int bananaWeight = bananas * oneBananaWeight;
      int milkWeight = 2 * 105;
      int iceCreamWeight = iceCream * oneIceCreamWeight;
      int eggWeight = eggs * oneEggWeight;
      int receptWeightInGramm = bananaWeight + iceCreamWeight + milkWeight + eggWeight;
      System.out.println(receptWeightInGramm + " Gramm");
      float receptWeightInKg = receptWeightInGramm / 1000f;
      System.out.println(receptWeightInKg + " kg");

      //Task#7
      System.out.println("Задача 7");
      int fat = 7;
      int firstDiet = 250;
      int secondDiet = 500;
      int fatInGramm = fat * 1000;
      int dayForFirstDiet = fatInGramm / firstDiet;
      int dayForSecondDiet = fatInGramm / secondDiet;
      System.out.println("Чтобы похудеть с первой диетой нужно " + dayForFirstDiet + " дней");
      System.out.println("Чтобы похудеть со второй диетой нужно " + dayForSecondDiet + " дней");
      int numberOnAverage = (firstDiet + secondDiet) / 2;
      int daysOnAverage = fatInGramm / numberOnAverage;
      System.out.println("В среднем нужно " + daysOnAverage + " дней, чтобы похудеть.");

      //Task#8
      System.out.println("Задача 8");
      int salaryOfMasha = 67760;
      int salaryOfDenis = 83690;
      int salaryOfCristina = 76230;
      float salaryOfMashaTenProcent = (float) 0.10 * salaryOfMasha;
      float salaryOfDenisTenProcent = (float) 0.10 * salaryOfDenis;
      float salaryOfCristinaTenProcent = (float) 0.10 * salaryOfCristina;
      double salaryOfMashaWithTenProcent = salaryOfMasha + salaryOfMashaTenProcent;
      double salaryOfDenisWithTenProcent = salaryOfDenisTenProcent + salaryOfDenis;
      double salaryOfCristinaWithTenProcent = salaryOfCristinaTenProcent + salaryOfCristina;
      double mashaYearSalaryAfterProcent = salaryOfMashaWithTenProcent * 12;
      double denisYearSalaryAfterProcent = salaryOfDenisWithTenProcent * 12;
      double cristinaYearSalaryAfterProcent = salaryOfCristinaWithTenProcent * 12;
      double salaryYearWithoutProcentMasha = salaryOfMasha * 12;
      double salaryYearWithoutProcentDenis = salaryOfDenis * 12;
      double salaryYearWithoutProcentCeristina = salaryOfCristina * 12;
      double differenceMasha = mashaYearSalaryAfterProcent - salaryYearWithoutProcentMasha;
      double differenceDenis = denisYearSalaryAfterProcent - salaryYearWithoutProcentDenis;
      double differenceCristina = cristinaYearSalaryAfterProcent - salaryYearWithoutProcentCeristina;
      System.out.println("Маша теперь получает " + salaryOfMashaWithTenProcent + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
      System.out.println("Денис теперь получает " + salaryOfDenisWithTenProcent + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
      System.out.println("Кристина теперь получает " + salaryOfCristinaWithTenProcent + " рублей. Годовой доход вырос на " + differenceCristina + " рублей");








    }
}
