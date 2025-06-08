package Ex_06_Ternary_Operator;

public class Lab052_Find_MaxNo_Btwn_TwoNum {

    public static void main(String[] args) {
        // Find the maximum number between two numbers
        int x =  10;
        int y = 20;

        // By using math. method
        System.out.println("Maximum value between x and y is = " + Math.max(x,y));
        System.out.println("Minimum value between x and y is = " + Math.min(x,y));

        // By using ternary operator
        String value = x > y ? "X value is greater" : " Y value is greater" ;
        System.out.println(value);

        int value1 = x > y ? x : y ;
        System.out.println(value1);




    }
}
