package Ex_02_Java_Basics_Part2;

public class Lab020_Constants {

    public static void main(String[] args) {

        int a = 50;
        System.out.println(a);

        final int b = 60;
        // b = 55 ;      //java: cannot assign a value to final variable b
        // b = b + 10 ;
        System.out.println(b);
    }
}
