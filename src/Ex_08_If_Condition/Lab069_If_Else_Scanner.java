package Ex_08_If_Condition;

import java.util.Scanner;

public class Lab069_If_Else_Scanner {

    public static void main(String[] args) {

        // Allowed to vote or not - age
        // If age > 18 -> allowed to vote.
        // else age < 18 -> Not allowed to vote.

        // How to take the user Input
        // 1. CLI Option ( Command line instructions )
        //  int age = Integer.parseInt(args[0]);

        // 2. Scanner Class

        System.out.println("Enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18)
        {
            System.out.println("You can go to CLUB !!");
        }
        else
        {
            System.out.println("You can't go to CLUB !!");
        }
    }
}
