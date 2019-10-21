package hometask2;
import java.util.Scanner;


public class ConversionsTemperature {

    public static void main(String[] args) {
        System.out.println("Ваше число в Фарентгейтах =" + convertCelsiusToFahrenheit());;
        System.out.println("Ваше число в цельсиях =" + convertFahrenheitToCelsius());
        System.out.println("Ваше число в кельвинах =" +convertCelsiusToKelvin());
    }
    public static float convertCelsiusToFahrenheit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите градусы цельсия: ");
        float c = in.nextFloat();
        float fahrenheit=(c*9/5) +32;
        return fahrenheit;
    }
    public static float convertFahrenheitToCelsius(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите градусы фарентгейта: ");
        int fahrenheit1 = in.nextInt();
        float c1= ((fahrenheit1-32f)*5f/9f);
        return c1;
    }
    public static float convertCelsiusToKelvin(){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите градусы цельсия: ");
        float c2 = in.nextFloat();
        float k=c2+273.16f;
        return k;
    }
}

