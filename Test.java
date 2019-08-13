package study;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<String> number = new LinkedList<String>();
        number.add("Anna");
        number.add("Tom");
        number.add("Vala");
        number.add("Koala");
        number.add("Bran");
        //number.remove(1);
        for (String x:number ) {
            System.out.println(number);
        }

    }
}