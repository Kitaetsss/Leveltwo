package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float firstWeight = 78.2f;
        System.out.println("Вес первого бойца " + firstWeight + " кг");

        float secondWeight = 82.7f;
        System.out.println("Вес второго бойца " + secondWeight + " кг");

        float commonWeight = firstWeight + secondWeight;
        System.out.println("Общий вес спортсменов " + commonWeight + " кг!");

        float differenceWeight = secondWeight - firstWeight;
        System.out.println("Разница по весу " + differenceWeight + " кг!");


        int bananasWeight = 5;
        int oneBananasWeight = 80;
        int differentBananasWeight = bananasWeight * oneBananasWeight;
        System.out.println("Бананы " + bananasWeight + " штук " + "(1 банан = " + oneBananasWeight + " грамм)" );

        int milkWeight = 200;
        int oneHundredMilkWeight = 105;
        System.out.println("Молоко - " + milkWeight + " мл" + "(100 мл = " + oneHundredMilkWeight + " грамм)");

        int differentMilkWeight = oneHundredMilkWeight * 2;
        System.out.println("Общий вес в граммах " + differentMilkWeight + " грамм!");

        int icecreamWeight = 2;
        int icecreamOneWeight = 100;
        int icecreamDifferentWeight = icecreamWeight * icecreamOneWeight;
        System.out.println("Мороженое пломбир - " + icecreamWeight + " брикета по " + icecreamOneWeight + " грамм");

        int eggWeight = 4;
        int oneEggWeight = 70;
        int differentEggWeight = eggWeight * oneEggWeight;
        System.out.println("Яйца сырые - " + eggWeight + " яйца (1 яйцо - " + oneEggWeight + " грамм)");

        float coctailWeight = differentEggWeight + differentBananasWeight + differentMilkWeight + differentBananasWeight;
        System.out.println("Общий вес коктеля " + coctailWeight + " грамм!");
        float coctailKgWeight = coctailWeight / 1000;
        System.out.println("Общий вес коктеля " + coctailKgWeight + " кг");


        int different = 7 * 1000;
        System.out.println("Всего нужно сбросить " + different + " грамм");
        int downHight1 = 250;
        int downHight2 = 500;
        int downDifferentHight1 = different / downHight1;
        int downDifferentHight2 = different / downHight2;
        System.out.println("Что бы сбрасывать по 250 грамм нужно " + downDifferentHight1 + " дней что бы потерять " + different + " грамм!");
        System.out.println("Что бы сбрасывать по 500 грамм нужно " + downDifferentHight2 + " дней что бы потерять " + different + " грамм!");
        int Days = downDifferentHight1 + downDifferentHight2;
        int middleDays = Days / 2;
        System.out.println("В среднем нужно " + middleDays + " дней");


        int masha = 67760;
        int procentMasha = masha / 10;
        System.out.println("Маша зарабатывает " + masha + " рублей");

        int mashaUp = masha + procentMasha;
        System.out.println("Маша теперь получает " + mashaUp + " рублей!" + "Годовой доход вырос на " + procentMasha + " рублей");

        int denis = 83690;
        int procentDenis = denis / 10;
        System.out.println("Денис зарабатывает " + denis + " рублей");
        int denisUp = denis + procentDenis;
        System.out.println("Денис теперь получает " + denisUp + " рублей!" + "Годовой доход вырос на " + procentDenis + " рублей");

        int kristina = 76230;
        int procentKristina = kristina / 10;
        System.out.println("Кристина зарабатывает " + kristina + " рублей");
        int kristinaUp = kristina + procentKristina;
        System.out.println("Кристина теперь получает " + kristinaUp + " рублей!" + "Годовой доход вырос на " + procentKristina + " рублей");
    }
}
