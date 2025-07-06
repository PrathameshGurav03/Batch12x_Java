package Ex_10_For_Loop;

public class Lab096_For_Loop_Continue_Even_Num {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++)
        {
            if(i%2==0)
            {
                continue;
            }
            System.out.println("Odd-->" + i);

        }
    }
}
