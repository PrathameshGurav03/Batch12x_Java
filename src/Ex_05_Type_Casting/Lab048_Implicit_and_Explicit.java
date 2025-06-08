package Ex_05_Type_Casting;

public class Lab048_Implicit_and_Explicit {

    public static void main(String[] args) {

        int course = 500;
        float GST = 20.99f;

 //       int total1 = course+GST; // Narrowing - Implicit
        int total = course+(int)GST; // Narrowing - Explicit
        System.out.println(total);


        float total2 = course+GST; // Widening - auto - implicit
//        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2);
    }
}
