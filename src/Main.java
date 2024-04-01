public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nЗадача 1 из ролика");
        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.printf("Одна порция сахара весит %s кг", onePortion);

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println();
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

        System.out.println("\nДомашняя работа №2");

        System.out.println("\nЗадача 1");
        byte variableByte = 26;
        short variableShort = 26541;
        int variableInt = 2554200;
        long variableLong = 21546545154546L;
        float variableFloat = 35.4f;
        double variableDouble = 155.25485;
        System.out.printf("Зачение переменной variableByte с типом byte равно %s", variableByte);
        System.out.printf("\nЗачение переменной variableShort с типом short равно %s", variableShort);
        System.out.printf("\nЗачение переменной variableInt с типом int равно %s", variableInt);
        System.out.printf("\nЗачение переменной variableLong с типом long равно %s", variableLong);
        System.out.printf("\nЗачение переменной variableFloat с типом float равно %s", variableFloat);
        System.out.printf("\nЗачение переменной variableDouble с типом double равно %s", variableDouble);

        System.out.println("\nЗадача 2");
        float f = 27.12f;
        long l = 987_678_965_549L;
        float f2 = 2.786f;
        short s = 569;
        int i = -159;
        short s2 = 27897;
        byte b2 = 67;
        System.out.printf("Значения переменных: \nf = %s; \nl = %s; \nf2 = %s; \ns = %s; \ni = %s; \ns2 = %s; \nb2 = %s."
                ,f,l,f2,s,i,s2,b2);

        System.out.println("\n\nЗадача 3");
        byte studentsInLudmilaPavlovnaClass = 23;
        byte studentsInAnnaSergeevnaClass = 27;
        byte studentsInEkaterinaAndreevnaClass = 30;
        short paperForAllClass = 480;
        int studentsInAllClasses = (studentsInLudmilaPavlovnaClass + studentsInAnnaSergeevnaClass +
                studentsInEkaterinaAndreevnaClass);
        System.out.printf("Всего в трех классах учится %s учеников", studentsInAllClasses);
        int paperForOneStudent = (paperForAllClass / studentsInAllClasses);
        System.out.printf("\nНа каждого ученика рассчитано %s листов бумаги.",paperForOneStudent);

        System.out.println("\nЗадача 4");
        byte knownPerformanceBottleProductionMachine = 16;
        System.out.printf("Известная производительность машины по изготовлению бутылок составляет %s бутылок за 2 минуты."
                , knownPerformanceBottleProductionMachine);
        System.out.println("\nДля решения задачи, найдем сколько производит бутылок машина за 1 минуту.");
        int performanceBottleProductionMachineForOneMinute = knownPerformanceBottleProductionMachine / 2;
        System.out.println("Машина за 1 минуту производит " + performanceBottleProductionMachineForOneMinute +
                " бутылок.");
        System.out.println("\nУзнаем сколько бутылок производит машина за: \n20 минут;\n" +
                "в сутки;\n" + "за 3 дня;\n" + "за 1 месяц.");

        int performanceBottleProductionMachineFor20Minutes = performanceBottleProductionMachineForOneMinute * 20;
        int minutesPerDay = 60 * 24;
        int performanceBottleProductionMachineForOneDay = performanceBottleProductionMachineForOneMinute * minutesPerDay;
        int performanceBottleProductionMachineForThreeDays = performanceBottleProductionMachineForOneDay * 3;
        int performanceBottleProductionMachineForOneMonth = performanceBottleProductionMachineForOneDay * 30;
        System.out.printf("\nЗа 20 минут машина произвела %s штук бутылок.", performanceBottleProductionMachineFor20Minutes);
        System.out.printf("\nЗа сутки машина произвела %s штук бутылок.", performanceBottleProductionMachineForOneDay);
        System.out.printf("\nЗа 3 дня машина произвела %s штук бутылок.", performanceBottleProductionMachineForThreeDays);
        System.out.printf("\nЗа 1 месяц машина произвела %s штук бутылок.", performanceBottleProductionMachineForOneMonth);

        System.out.println("\n\nЗадача 5");
        byte canPaintForAllClassesSchool = 120;
        byte canWhitePaintForOneClass = 2;
        byte canBraunPaintForOneClass = 4;
        int allCanPaintForOneClass = canBraunPaintForOneClass + canWhitePaintForOneClass;
        int classesInSchool = canPaintForAllClassesSchool / allCanPaintForOneClass;
        int canWhitePaintForAllClasses = classesInSchool * canWhitePaintForOneClass;
        int canBraunPaintForAllClass = canBraunPaintForOneClass * classesInSchool;
        System.out.printf("Для покраски одного класса требуется %s банки с белой краской и %s банки с коричневой краской." +
                "Всего было закуплено %s банок с краской. " +
                        "\nДля дальнейших расчетов узнаем сколько всего классов есть в школе. " +
                "\nИсходя из общего колличества краски %s банок и кол-ва краски необходимой для покраски одного " +
                "класса %s, находим, что всего в школе классов %s. " +
                        "\nИсходя из колличества классов найдем кол-во белой и коричневой краски. " +
                "\nОтвет: в школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски",
                canWhitePaintForOneClass, canBraunPaintForOneClass, canPaintForAllClassesSchool,
                canPaintForAllClassesSchool, allCanPaintForOneClass, classesInSchool, classesInSchool,
                canWhitePaintForAllClasses, canBraunPaintForAllClass);

        System.out.println("\n\nЗадача 6");
        int bananas = 5;
        int oneBananWeight = 80;

        int milk = 200;
        int milk100gr = milk / 100;
        int milk100grWeight = 105;

        int ice = 2;
        int oneIceWeight = 100;

        int eggs = 4;
        int oneEggWeight = 70;

        int allBananasWeight = bananas * oneBananWeight;
        int allIceWeight = ice * oneIceWeight;
        int allMilkWeight = milk100grWeight * milk100gr;
        int allEggsWeight = eggs * oneEggWeight;

        int breakfastWeightGr = allBananasWeight + allMilkWeight + allIceWeight + allEggsWeight;
        float breakfastWeightKg = breakfastWeightGr / 1000f;
        System.out.printf("Необходимо посчитать вес завтрака спортсмена. В завтрак входят: " +
                "\nБананы %s шт. по %s гр.; " +
                "\nМолоко %s гр. по %s гр. за 100 мл.;" +
                "\nМороженое пломбир %s брикета по %s гр. за брикет;" +
                "\nЯйца %s штук по %s шт." +
                "\nОбщий вес продуктов используемых в завтраке:" +
                "\nБананы - %s гр.; " +
                "\nМолоко - %s гр.; " +
                "\nМороженое - %s гр.;" +
                "\nЯйца - %s гр." +
                "\nИтого общий вес завтрака в граммах получается %s гр." +
                "\nПереводим в киллограмы, получается %s кг.",
                bananas, oneBananWeight,
                milk, milk100grWeight,
                ice, oneIceWeight,
                eggs, oneEggWeight,
                allBananasWeight,
                allMilkWeight,
                allIceWeight,
                allEggsWeight,
                breakfastWeightGr,
                breakfastWeightKg);

        System.out.println("\n\nЗадача 7");
        int requiredDifferenceWeightKg = 7;
        int requiredDifferenceWeightGr = requiredDifferenceWeightKg * 1000;
        int weightLossPerDayMin = 250;
        int weightLossPerDayMax = 500;

        int timeWithMinLoss = requiredDifferenceWeightGr / weightLossPerDayMin;
        int timeWithMaxLoss = requiredDifferenceWeightGr / weightLossPerDayMax;
        int averageTimeLoss = (timeWithMaxLoss + timeWithMinLoss) / 2;

        System.out.printf("Время необходимое, чтобы потерять %s кг. веса:" +
                "\n- при потере %s гр/день - %s дней;" +
                "\n- при потере %s гр/день - %s дней." +
                "\nСреднее время потери веса составляет - %s день.",
                requiredDifferenceWeightKg,
                weightLossPerDayMin, timeWithMinLoss,
                weightLossPerDayMax, timeWithMaxLoss,
                averageTimeLoss);

        System.out.println("\n\nЗадача 8");
        double salaryIncrease = 0.1;
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int cristinaSalary = 76_230;

        double mashaSalaryAfterIncrease = (mashaSalary * salaryIncrease) + mashaSalary;
        double denisSalaryAfterIncrease = (denisSalary * salaryIncrease) + denisSalary;
        double cristinaSalaryAfterIncrease = (cristinaSalary * salaryIncrease) + cristinaSalary;

        double mashaSalaryBeforeIncreasePerYear = mashaSalary * 12;
        double denisSalaryBeforeIncreasePerYear = denisSalary * 12;
        double cristinaSalaryBeforeIncreasePerYear = cristinaSalary * 12;

        double mashaSalaryAfterIncreasePerYear = mashaSalaryAfterIncrease * 12;
        double denisSalaryAfterIncreasePerYear = denisSalaryAfterIncrease * 12;
        double cristinaSalaryAfterIncreasePerYear = cristinaSalaryAfterIncrease * 12;

        double differentSalaryMashaBeforeAfter = mashaSalaryAfterIncreasePerYear - mashaSalaryBeforeIncreasePerYear;
        double differentSalaryDenisBeforeAfter = denisSalaryAfterIncreasePerYear - denisSalaryBeforeIncreasePerYear;
        double differentSalaryCristinaBeforeAfter = cristinaSalaryAfterIncreasePerYear - cristinaSalaryBeforeIncreasePerYear;

        System.out.printf("Изменения в заработной плате сотрудников:" +
                "\n- Маша теперь получает зарплату %s рублей/мес. Годовой доход вырос на %s рублей;" +
                "\n- Денис теперь получает зарплату %s рублей/мес. Годовой доход вырос на %s рублей;" +
                "\n- Кристина теперь получает зарплату %s рублей/мес. Годовой доход вырос на %s рублей;",
                mashaSalaryAfterIncrease, differentSalaryMashaBeforeAfter,
                denisSalaryAfterIncrease, differentSalaryDenisBeforeAfter,
                cristinaSalaryAfterIncrease, differentSalaryCristinaBeforeAfter);



    }
}