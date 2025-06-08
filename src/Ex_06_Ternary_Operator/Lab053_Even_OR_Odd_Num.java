package Ex_06_Ternary_Operator;

public class Lab053_Even_OR_Odd_Num {

    public static void main(String[] args) {

        //Find out even odd number

        int num = 6;

//        Step 1 : Input , Output --> datatype
//                --> Input : Int
//                --> Output : String

        String S = ( num%2==0 ) ? "It's Even Number " : "It's Odd Number"  ;
        System.out.println(S);

        // Edge Cases
        // Negative, float, 0
    }
}
