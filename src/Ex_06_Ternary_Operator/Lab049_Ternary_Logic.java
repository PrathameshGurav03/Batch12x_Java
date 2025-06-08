package Ex_06_Ternary_Operator;

public class Lab049_Ternary_Logic {

    public static void main(String[] args) {

        // --> Syntax
        // result = condition ? expression1 : expression2;

        int my_age = 19;
        String am_i_eligiable_to_get_my_passport = my_age > 18 ? "You're Eligible" : "You're Not Eligible";
        System.out.println(am_i_eligiable_to_get_my_passport);
    }
}
