package Ex_07_Increment_Decrement_OP;

public class Lab057_Pre_Increment_Decrement {

    public static void main(String[] args) {

        //Pre Increment Concept
//       Pre - increment -> ++a, operands
//       value is incremented first and then stored in the result.

        int a = 10;
        int b = ++a; // ++a means a+1 that b = 11

        System.out.println(a);
        System.out.println(b);

        //  Exp and Result Table
        // Line No | a | Result b
        // 8   |  10 |  NA
        // 9    | 11  |  11
        // 10   | 11 - print | 11
        // 11   | 11 | 11 - print

    }
}
