public class Main
{
    public static void main(String[] args)
    {
        // exercise 1
        int myInt = 1;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);
        byte myByte = 2;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        short myShort = 3;
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        long myLong = 4L;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        float myFloat = 3.5f;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        double myDouble = 2.3;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        // exercise 2
        float p1 = 27.12f;
        long p2 = 987678965549L;
        float p3 = 2.786f;
        short p4 = 569;
        short p5 = -159;
        short p6 = 27897;
        byte p7 = 67;

        // exercise 3
        byte firstClassCount = 24;
        byte secondClassCount = 27;
        byte thirdClassCount = 30;
        short allListCount = 480;
        int onePeopleListCount = allListCount / (firstClassCount + secondClassCount + thirdClassCount);
        System.out.println("На каждого ученика рассчитано " + onePeopleListCount + " листов бумаги.");
        System.out.println();

        // exercise 4
        byte bottleCount = 16;
        byte fillTime = 2;
        int capacity = bottleCount / fillTime;
        int timeInMinute = 20;
        int result = capacity * timeInMinute;
        System.out.println("За " + timeInMinute + " минут" + " машина произвела " + result + " штук бутылок.");

        short timeInDays = 1;
        timeInMinute = timeInDays * 24 * 60;
        result = capacity * timeInMinute;
        System.out.println("За " + timeInDays + " дней" + " машина произвела " + result + " штук бутылок.");

        timeInDays = 3;
        timeInMinute = timeInDays * 24 * 60;
        result = capacity * timeInMinute;
        System.out.println("За " + timeInDays + " суток" + " машина произвела " + result + " штук бутылок.");

        byte timeInMonth = 1;
        timeInMinute = timeInDays * 24 * 60 * 30;
        result = capacity * timeInMinute;
        System.out.println("За " + timeInMonth + " месяцев" + " машина произвела " + result + " штук бутылок.");
        System.out.println();

        // exercise 5
        byte red = 2;
        byte white = 4;
        byte allCount = 120;
        byte classCount = (byte) (allCount / (red + white));
        int redCount = red * classCount;
        int whiteCount = white * classCount;
        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteCount + " банок белой краски и " + redCount + " банок коричневой краски.");
        System.out.println();

        // exercise 6
        byte bananaWeight = 80;
        byte bananaCount = 5;
        short milkVolume = 2;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte iceCreamCount = 2;
        byte eggWeight = 70;
        byte eggCount = 4;
        int mass = bananaWeight * bananaCount + milkVolume * milkWeight + iceCreamWeight * iceCreamCount + eggWeight * eggCount;
        float massToFloat = mass / 1000f;
        System.out.println("Спортсмен жрет... хавает... т.е. потребляет " + mass + " грамм или " + massToFloat + " кг пищи.");
        System.out.println();

        // exercise 7
        int m = 7000;
        int plan1 = 250;
        int plan2 = 500;
        int duration1 = m / plan1;
        int duration2 = m / plan2;
        float averageDuration = (duration1 + duration2) / 2f;
        System.out.println("Время похудения спортмена (да да, который жра... потреблял по кг за прием) " + " при худении на " + plan1 + " грамм в день составит " + duration1 + " дней;" + " при худении на " + plan2 + " грамм в день составит " + duration2 + " дней;" + " или в среднем " + averageDuration + " дней.");
        System.out.println();

        // exercise 8
        float currentSalaryMashaMonth = 67760;
        float currentSalaryDenisMonth = 83690;
        float currentSalaryKristineMonth = 76230;

        float prevSalaryMashaMonth = currentSalaryMashaMonth;
        float prevSalaryDenisMonth = currentSalaryDenisMonth;
        float prevSalaryKristineMonth = currentSalaryKristineMonth;
        float salaryRise = 1.1f;

        // inc salaries;
        currentSalaryMashaMonth *= salaryRise;
        currentSalaryDenisMonth *= salaryRise;
        currentSalaryKristineMonth *= salaryRise;

        //calc year rise
        float salaryRiseMashaYear = (currentSalaryMashaMonth - prevSalaryMashaMonth) * 12;
        float salaryRiseDenisYear = (currentSalaryDenisMonth - prevSalaryDenisMonth) * 12;
        float salaryRiseKristineYear = (currentSalaryKristineMonth - prevSalaryKristineMonth) * 12;

        System.out.println("Маша теперь получает " + currentSalaryMashaMonth + " рублей. Годовой доход вырос на " + salaryRiseMashaYear + " рублей");
        System.out.println("Денис теперь получает " + currentSalaryDenisMonth + " рублей. Годовой доход вырос на " + salaryRiseDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + currentSalaryKristineMonth + " рублей. Годовой доход вырос на " + salaryRiseKristineYear + " рублей");
    }
}