package Ex_05_Type_Casting;

public class Lab047_Type_Casting_02 {

    public static void main(String[] args) {

        int val = 300;
//      byte b = val; --> Narrowing - Implicit JVM to do it. - Data loss will be there.
        byte b1 = (byte) val; // Narrowing - EXPLICIT JVM to do it. - Data loss will be there.
        System.out.println(b1); // 44

        System.out.println();

        long mobile_no = 9876543210l;
        //short s1 = mobile_no; // Narrowing - implicit ( s = 9876543210l )
        short s2 = (short)mobile_no; // Narrowing - Explicit
        System.out.println(s2); // 5866

    }
}
