package Ex_09_Switch_Case;

public class Lab080_Different_Way_For_Cases {

    public static void main(String[] args) {

        // JDK > 13

        int itemcode = 005;
        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004, 006, 007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
    }

}
