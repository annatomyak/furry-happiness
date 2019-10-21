package hometask2;

public class TimeCalculation {
    public static void main(String[] args) {

    System.out.println(convertSecondsToDays());
    System.out.println(convertSecondsToHours());
    System.out.println(convertSecondsToMin());
    }
    public static float convertSecondsToDays(){
        int sec=100000;
        float days=sec/86400f;
        return days;
    }
    public static float convertSecondsToHours(){
        int sec1=200000;
        float hours=sec1/3600f;
        return hours ;
    }
    public static float convertSecondsToMin(){
        int sec2=200000;
        float min=sec2/60f;
        return min ;
    }
}
