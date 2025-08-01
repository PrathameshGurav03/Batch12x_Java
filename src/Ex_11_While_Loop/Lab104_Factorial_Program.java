package Ex_11_While_Loop;

import java.util.Scanner;

public class Lab104_Factorial_Program {

    public static void main(String[] args) {

        // --> Factorial Program

        // The logic building formula we are discussing.
        // Step number one, you have to figure out what is the data type for input and output.
        // Step number two, write a rough logic around this.
        // Step number three, write a proper logic around this.
        // Step number four, optimize.
        // Step number five, which is edge cases.

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter number, whose factorial you want !!");

        if(!scanner.hasNextInt())
        {
            System.out.println("Enter the int");
        }
        int number= scanner.nextInt();
        int factorial = 1;

        if(number==0)
        {
            System.out.println("Factorial is :"+ factorial);
        }
        if(number>Integer.MAX_VALUE)
        {
            System.out.println("Can't get the factorial as out of bound!(int)");
        }
        int i=1;
        while(i<=number)
        {
            factorial=factorial*1;
            System.out.println(i);
            i++;
        }
        System.out.println("factorial is -> "+factorial);

    }
}
