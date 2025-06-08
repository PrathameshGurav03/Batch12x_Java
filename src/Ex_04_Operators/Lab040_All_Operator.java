package Ex_04_Operators;

public class Lab040_All_Operator {

    public static void main(String[] args) {

        boolean b1 = true;
        int a = 50;
        int b = 100;
        System.out.println(a + b); //150
        System.out.println(a > b); // False
        System.out.println(a >= b); // False
        System.out.println(a == b);  // False
        System.out.println(a != b); // True
        System.out.println(a < b); // True
        System.out.println(a <= b ); // True
        System.out.println(b/a); // 2  --> In division quotient will be the answer


        System.out.println();
        // Arithmetic Operators
        // +,-,%,/,*

        // Compound Assignment Operators
        int age = 10;
        age += 10;   // age = age+10 =  20
        age /=10; // age = age/10 = 20/10 = 2 Output.
        System.out.println(age);

//        2. Operation:
//        The operator performs an operation on the variable on the left-hand side and the value on the right-hand side.
//        3. Assignment:
//        The result of the operation is then assigned back to the variable on the left-hand side.

    }
}
