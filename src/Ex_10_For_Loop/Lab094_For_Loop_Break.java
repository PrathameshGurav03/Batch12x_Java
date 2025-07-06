package Ex_10_For_Loop;

public class Lab094_For_Loop_Break {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++)
        {                                // 0 to 49, 50 times
                                        // System.out.println(i);
            if (i == 10)
            {
                break;
                                       // System.out.println(i);
            }
            System.out.println(i);
        }
    }
}
