package Ex_08_If_Condition;

import java.util.Scanner;

public class Lab_070_Interview_QnA {

    public static void main(String[] args) {

        System.out.println("Enter value for a : ");
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();

        if ( a==10)
        {
            System.out.println("You're Smart");
        }
        else
        {
            System.out.println("You're Fool");
        }
    }
}
