package Ex_09_Switch_Case;

public class Lab079_JDK_Above_13 {

    public static void main(String[] args) {

        // in JDK > 13 ( Supported )
        int itemCode = 001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");
        }



    }
}

