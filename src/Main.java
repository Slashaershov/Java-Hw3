public class Main
{
    public static void main(String[] args)
    {
        // exercise 1
        int myInt = 1;
        byte myByte = 2;
        short myShort = 3;
        long myLong = 4L;
        float myFloat = 3.5f;
        double myDouble = 2.3;

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
        int onePeopleListCount = allListCount/
                (firstClassCount +secondClassCount +thirdClassCount);
        System.out.println("На каждого ученика рассчитано "+ onePeopleListCount + " листов бумаги." );

        // exercise 4
        byte bottleCount = 16;
        byte fillTime = 2;
        int capacity =  bottleCount/fillTime;
        int timeInMinute = 20;
        int result = capacity *timeInMinute;
        System.out.println("За " + timeInMinute + " минут" +" машина произвела " + result + " штук бутылок.");

        short timeInDays = 1;
        timeInMinute = timeInDays*24*60;
        result = capacity *timeInMinute;
        System.out.println("За " + timeInDays + " дней" +" машина произвела " + result + " штук бутылок.");

        timeInDays = 3;
        timeInMinute = timeInDays*24*60;
        result = capacity *timeInMinute;
        System.out.println("За " + timeInDays + " суток" +" машина произвела " + result + " штук бутылок.");

        byte timeInMounth =1;
        timeInMinute = timeInDays*24*60*30;
        result = capacity *timeInMinute;
        System.out.println("За " + timeInMounth + " месяцев" +" машина произвела " + result + " штук бутылок.");

        // exercise 5
        byte red = 2;
        byte white = 4;
        byte allCount = 120;
        byte classCount = (byte) (allCount/(red + white));
        int redCount = red * classCount;
        int whiteCount = white * classCount;
        System.out.println("В школе, где " + classCount + " классов, нужно " + whiteCount + " банок белой краски и "+ redCount + " банок коричневой краски.");

        // exercise 6
        byte bananaWeight = 80;
        byte bananaCount = 5;
        short milkVolume = 2;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte iceCreamCount = 2;
        byte eggWeight = 70;
        byte eggCount = 4;
        int mass = bananaWeight*bananaCount
                +milkVolume*milkWeight
                + iceCreamWeight*iceCreamCount
                +eggWeight*eggCount;
        float massToFloat = mass/1000f;
        System.out.println("Спортсмен жрет... хавает... т.е. потребляет " +mass+ " грамм или " + massToFloat + " кг пищи.");

        // exercise 7
        int m = 7000;
        int plan1 = 250;
        int plan2 = 500;
        int duration1 = m/plan1;
        int duration2 = m/plan2;
        float averageDuration = (duration1 + duration2)/2f;
        System.out.println("Время похудения спортмена (да да, который жра... потреблял по кг за прием) "
                + " при худении на " + plan1 + " грамм в день составит "  + duration1 + " дней;"
                + " при худении на " + plan2 + " грамм в день составит "  + duration2 + " дней;"
                + " или в среднем " + averageDuration + " дней.");


    }

}