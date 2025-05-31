package Ex_04_Operators;

public class Lab036_Interview_Concat_Plus_01 {

    public static void main(String[] args) {

        String first_name = "Pratham";
        String last_name = "Gurav";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b); // Output : PrathamGurav1010
        System.out.println(a + b + first_name + last_name);

        System.out.println(first_name + last_name + (a + b));

        // BODMAS - Bracket of Div, mul, add, sub
    }
}
