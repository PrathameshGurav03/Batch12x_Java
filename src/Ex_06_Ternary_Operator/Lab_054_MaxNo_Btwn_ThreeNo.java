package Ex_06_Ternary_Operator;

public class Lab_054_MaxNo_Btwn_ThreeNo {

    public static void main(String[] args) {

        int n1 = 80;
        int n2 = 50;
        int n3 = 30;

        //Logic building formula
        // Step 1 ->  Find the inputs and outputs data type
        // I/O -> n1,n2,n3 -> int
        // O/P -> int - max number or String we can show message with max number

        // Step 2 - Rough Logic, Think about it.
        //  n1 >  n2 && n1 > n3 -> n1
        // n2 > n3 && n2 > n1 -> n2
        // n3

        // Step 3 - Dry run program

        int max = ( n1 > n2 ) ? ( n1 > n3 ) ? n1 : n3 : ( n2 > n3 ) ? n2 : n3 ;
        System.out.println(max);
    }
}
