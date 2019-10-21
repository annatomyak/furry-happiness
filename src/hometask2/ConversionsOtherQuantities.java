package hometask2;

import java.util.Scanner;

public class ConversionsOtherQuantities {
    public static void main(String[] args) {
        System.out.println("Ваше число в дюймах" + convertMetersToInches());;
        System.out.println("Ваше число в метрах =" + convertInchesToMeters());
        System.out.println("Ваше число в км =" +convertMilesToKilometres());
        System.out.println("Ваше число в милях =" +convertKilometresToMiles());
        System.out.println("Ваше число в фунтах" +convertKilogramsToPounds());
        System.out.println("Ваше число в кг" +convertPoundsToKilograms());
        System.out.println("Ваше число в милях/час"+convertSpeedKmOnHrToMiOnHr());
        System.out.println("Ваше число в км/час"+convertSpeedMiOnHrToKmOnHr());

    }
    public static float convertMetersToInches(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите метры ");
        int m = in.nextInt();
        float inc= m*39.37f;
        return inc;
    }
    public static float convertInchesToMeters(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дюймы ");
        int inc2 = in.nextInt();
        float m2=inc2/39.37f;
        return m2 ;
    }
    public static float  convertMilesToKilometres(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите мили ");
        int mi = in.nextInt();
        float km=1.609f*mi;
        return km ;
    }
    public static float  convertKilometresToMiles(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите км ");
        int km1 = in.nextInt();
        float mi1=km1/1.609f;
        return mi1 ;
    }
    public static float  convertKilogramsToPounds(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите кг ");
        int kg = in.nextInt();
        float pn=kg*2.2046f;
        return pn ;
    }
    public static float  convertPoundsToKilograms(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в фунтах ");
        int pn1 = in.nextInt();
        float kg1=pn1/2.2046f;
        return kg1 ;
    }
    public static float  convertSpeedKmOnHrToMiOnHr(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в  km/hr ");
        int speedKmOnHr = in.nextInt();
        float speedMiOnHr=speedKmOnHr/1.609f;
        return  speedMiOnHr;
    }
    public static float  convertSpeedMiOnHrToKmOnHr(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в  милях на час ");
        int speedMiOnHr1 = in.nextInt();
        float speedKmOnHr1=speedMiOnHr1*1.609f;
        return  speedKmOnHr1;
    }
}
