package hometask2;

import java.util.Scanner;

public class MarksConversions {
    public static void main(String[] args) {
        System.out.println("resultTest = " + percentagePassExam() + "%");;

    }
    public static float percentagePassExam(){
        Scanner in = new Scanner(System.in);
        System.out.print("total tests =  ");
        int totalTest = in.nextInt();
        System.out.print("marked tests  ");
        int markedTest = in.nextInt();
        float resultTest = ((markedTest*100)/totalTest);
        return resultTest;
    }
}
