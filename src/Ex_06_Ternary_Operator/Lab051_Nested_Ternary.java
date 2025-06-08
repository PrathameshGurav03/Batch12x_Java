package Ex_06_Ternary_Operator;

public class Lab051_Nested_Ternary {

    public static void main(String[] args) {

        //Nested ternary operator
        // Syntax :
        // result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int age1 = 25;
        int age2 = 17;

        String s1 = age1 > 18 ? ( age1 > 25 ? " In GOA you can drink " : " You can't drink " ) : " You cant go GOA ";
        System.out.println(s1);

        String s2 = age2 > 18 ? ( age2 > 25 ? " In GOA you can drink " : " You can't drink " ): " You cant go GOA ";
        System.out.println(s2);



    }
}
