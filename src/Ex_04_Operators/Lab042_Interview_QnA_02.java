package Ex_04_Operators;

public class Lab042_Interview_QnA_02 {

    public static void main(String[] args) {

        System.out.println(!(10>20)); //--> Comparing values will give output with boolean result

//       1. It inverts the value of a boolean expression:
//
//       2 If the expression is true," ! " makes it false.
//
//       3. If the expression is false, "!" makes it true.

        System.out.println();
        int my_salary = 50;
        boolean b = !(my_salary > 10 || my_salary < 5);
        System.out.println(b);

        // A - my_salary > 10 -> 12 > 10 -> true
        // B -> my_salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false
    }
}
