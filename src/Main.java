public class Main {
    public static void main(String[] args) {
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var stuffWeifht = 20;
        var capacityLeft = liftingCapacity - stuffWeifht;
        System.out.println("Еще можно положить " + capacityLeft + " кг. вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumberWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("Общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - stuffWeifht - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight + " кг!!");

        leftWeight = liftingCapacity - stuffWeifht - productsWeight;
        System.out.println("Теперь места осталось " + leftWeight + " кг!!!");

        var overload = (stuffWeifht + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("Продуктов в одной машине теперь " + productsInOneCar + " кг.");

        var name = "Евгений";
        var age = 30;
        System.out.println("\nМеня зовут " + name + " и мне " + age + " лет");

        System.out.println("\nДомашняя работа. Переменные.");
        System.out.println("\nЗадача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Собаки - " + dog + "; \nКошки - " + cat + "; \nБумага - " + paper + ".");

        System.out.println("\nЗадача 2");
        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("Собаки - " + dog + "; \nКошки - " + cat + "; \nБумага - " + paper + ".");

        System.out.println("\nЗадача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Собаки - " + dog + "; \nКошки - " + cat + "; \nБумага - " + paper + ".");

        System.out.println("\nЗадача 4");
        var friend = 19;
        System.out.println("У меня " + friend + " друзей.");

        friend += 2;
        System.out.println("У меня теперь " + friend + " друг.");

        friend /= 7;
        System.out.println("У меня теперь " + friend + " друга.");

        System.out.println("\nЗадача 5");
        var frog = 3.5;
        System.out.println("Лягушка - " + frog);

        frog *= 10;
        System.out.println("Лягушка - " + frog);

        frog /= 3.5;
        System.out.println("Лягушка - " + frog);

        frog += 4;
        System.out.println("Лягушка - " + frog);

        System.out.println("\nЗадача 6");
        var firstFighterWeight = 78.2;
        var secondFighterWeight = 82.7;
        var summaryFigtersWeight = firstFighterWeight + secondFighterWeight;
        var differenceFightersWeight = secondFighterWeight - firstFighterWeight;
        System.out.printf("Общая масса бойцов - %s; \nРазница массы бойцов - %s."
                ,summaryFigtersWeight, differenceFightersWeight);

        System.out.println("\n\nЗадача 7");
        var remainDivisionFightersWeight = secondFighterWeight % firstFighterWeight;
        System.out.println("Остаток деления между весами боксеров - " + remainDivisionFightersWeight);

        System.out.println("\nЗадача 8");
        System.out.println("Действие 1");
        var allWorkingHours = 640;
        var workingHoursOneStaff = 8;
        var workingStaff = allWorkingHours / workingHoursOneStaff;
        System.out.printf("Всего в компании работает - %s человек", workingStaff);

        System.out.println("\nДействие 2");
        var newWorkingStaff = workingStaff + 94;
        var newWorkingHouseOneStaff = allWorkingHours / newWorkingStaff;
        System.out.printf("Если в компании работает - %s человек, то один сотрудник будет посвящать работе %s часа",
                newWorkingStaff, newWorkingHouseOneStaff);
    }
}