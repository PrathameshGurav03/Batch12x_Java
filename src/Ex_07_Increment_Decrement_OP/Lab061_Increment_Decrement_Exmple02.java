package Ex_07_Increment_Decrement_OP;

public class Lab061_Increment_Decrement_Exmple02 {

    public static void main(String[] args) {

        int a = 10;
        System.out.println(a++ + a);

        // Logic building formula
        // A+B
        // A -> a++ -> ExpA -> 10 , a -> 11
        // +
        // B -> a -> ExpB -> 11

        // ERT ( Expression result table )
        // LNo |  a | Exp
        // 5   | 10  | NA
        // 6   | -  | 10+11 ->  21
    }
}
