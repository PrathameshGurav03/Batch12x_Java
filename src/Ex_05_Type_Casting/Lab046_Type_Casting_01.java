package Ex_05_Type_Casting;

public class Lab046_Type_Casting_01 {

    public static void main(String[] args) {

//        - Type casting in Java is the process of converting a value from one data type to another.**
//        - There are two main types of type casting:
//        1. widening   -> Explicit, Implicit
//        2. narrowing  -> Explicit, Implicit

//        --> Widening Casting
//        - Widening casting, also known as implicit casting, occurs when converting a smaller data type to a larger one.
//        - This type of casting is performed automatically by the Java compiler
//        and is considered safe because there's no risk of data loss.


        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type
        System.out.println(a);
        // Implicit - Casting - Widening


        System.out.println();
        byte b1 = 20;
        int a1 = b1; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a2 = (int)b1; // Explicit - Casting - Widening (int) - optional
        System.out.println(a2);
    }
}
