package Ex_06_Ternary_Operator;

public class Lab050_Positive_or_Negative {

    public static void main(String[] args) {

        // --> Syntax -
        // result =  condition ? "expression1" : "expression2";

        int number = -5;

        String s= number > 0 ? "Positive Number" : "Negative Number";
        System.out.println(s);

        int number1 = -10;
        String s1= number1 == 0 ? "Neutral Number" : "Positive or Negative Number";
        System.out.println(s1);


    }
}
