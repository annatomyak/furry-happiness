package hometask2;

import java.util.Scanner;

public class MultipleChoiceTestScore {
    public static void main(String[] args) {
       percentagePassExam();


    }

    public static void percentagePassExam() {
        Scanner in = new Scanner(System.in);
        System.out.print("total tests =  ");
        int totalTest = in.nextInt();
        System.out.print("passed tests  ");
        int passedTest = in.nextInt();
        int failedTest = totalTest - passedTest;
        System.out.println("failed test =" + failedTest);
        float resultPassedTest = ((passedTest * 100) / totalTest);
        float resultFailedTest = ((failedTest * 100) / totalTest);
        System.out.println("Result: passed ="+resultPassedTest + "% ,failed :" +resultFailedTest+"%" );

    }
}