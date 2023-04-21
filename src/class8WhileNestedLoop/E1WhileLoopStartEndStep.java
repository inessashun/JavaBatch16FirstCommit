package class8WhileNestedLoop;

import java.util.Scanner;

public class E1WhileLoopStartEndStep {
    public static void main(String[] args) {
        //to print all the numbers from starting point to ending point
        //ask the user for starting and ending numbers

        /*int start=15;
        int end=30;
        */
        System.out.println("******");

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the starting point, ending point and step ");

        int start=scan.nextInt();
        int end=scan.nextInt();

        int step=scan.nextInt();

        int num=start;
        while(num<=end){
            System.out.print(num+" ");
            num=num+step; //num+=step; //num++;
        }
        System.out.println("******");

        System.out.println("Please enter the starting point, ending point");
        int Start=scan.nextInt();
        int End=scan.nextInt();

        int counter=Start;

        while(counter<=End){
            System.out.print(counter+" ");
            counter++;
        }
    }
}
