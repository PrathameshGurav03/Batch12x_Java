package Ex_04_Operators;

public class Lab039_OR_AND_Gate {

    public static void main(String[] args) {

        // || - OR GATE LOGIC

        System.out.println(true || true); // True
        System.out.println(true || false); // True
        System.out.println(false || true);  // True
        System.out.println(false || false); // False

        //  AND GATE LOGIC -  && --> only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F
        System.out.println();
        System.out.println(true && true); // True
        System.out.println(true && false); // False
        System.out.println(false && true); // False
        System.out.println(false && false); // False
    }
}
