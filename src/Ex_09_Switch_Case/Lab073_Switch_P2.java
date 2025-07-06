package Ex_09_Switch_Case;

import java.util.Scanner;

public class Lab073_Switch_P2 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number from 1 to 7: ");
        int day=scanner.nextInt();

        switch (day)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;

                // ---> On entering string you'll get error as edge cases are not handled
                //Exception in thread "main" java.util.InputMismatchException
        }
    }
}
