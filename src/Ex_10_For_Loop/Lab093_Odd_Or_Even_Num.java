package Ex_10_For_Loop;

public class Lab093_Odd_Or_Even_Num {

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++)
        if(i%2==0)
        {
            System.out.println("Even-->" + i);
        }
        for (int j = 0; j < 10 ; j++)
        if(j%2!=0)
        {
            System.out.println("Odd-->" + j);
        }

    }
}
