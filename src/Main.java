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
        System.out.println("На каждого ученика рассчитано "+ onePeopleListCount + "листов бумаги" );
    }

}