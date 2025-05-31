package Ex_02_Java_Basics_Part2;

public class Lab019_Printf_Concept {

    public static void main(String[] args) {

        int a = 100;
        System.out.println(a);
        System.out.printf("Your variable value is %d", a);
        System.out.println();
        // printf -> `printf basically adds formatting to the output. `

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int b = 200;
        System.out.println(b);
        System.out.printf("Value of variable b is %d", b);
        System.out.println();
        System.out.printf("Value of a is %d, Value of b is %d", a, b);
        System.out.println();
        System.out.printf("a = %d, b = %d",a,b);

        System.out.println();

        boolean b1 = true;
        System.out.printf("Boolean value is %b",b1);

        System.out.println();

        String s1 = "Pratham";
        System.out.printf("String value is %s", s1);

        System.out.println();

        float f1 = 2.92f;
        System.out.printf("Float value is %f", f1);





    }
}
