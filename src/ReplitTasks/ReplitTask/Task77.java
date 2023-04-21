package ReplitTasks.ReplitTask;

import java.util.Scanner;

public class Task77 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input=scan.nextInt();

        int [] numbers= {input};
        for(int i=5; i<numbers.length; i--)
            System.out.println(numbers[i]);


    }
}
