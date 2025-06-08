package Ex_07_Increment_Decrement_OP;

public class Lab058_Post_Increment_Decrement {

    public static void main(String[] args) {

//        int a= 20;
//        System.out.println(++a);
//        System.out.println(a);

//        Post increment
//        Post a++
//       - print first and then value is incremented

        int a_post = 15;
        int b =  a_post++;
        System.out.println(a_post);
        System.out.println(b);

          // ERT ( Exp and Result Table)
//        // LNo |  a_post | b
//        // 11  |  15 | NA
//        // 12  |  16  | 15
//        // 13  |  16  | NA
//        // 14  |  NA  | 15

        int a_post1 = 10;
        System.out.println(a_post1++); // value is 10 here
        System.out.println(a_post1); // value is 10+1 = 11








    }
}
