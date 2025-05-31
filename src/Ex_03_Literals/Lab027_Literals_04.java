package Ex_03_Literals;

public class Lab027_Literals_04 {

    public static void main(String[] args) {

        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        //  char c = "A"; // "" String --> Bunch of Char

        char c2 = 'Z';
        char c3 = '%';
        char c4 = '$';
        char c5 = '^';
        char c6 = '*';
        char c7 = ')';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("PrathameshGurav");
        System.out.println("Prathamesh"+new_line+"Gurav");
        System.out.println("Prathamesh\nGurav");
        System.out.println("Prathamesh"+tab_line+"Gurav");
        System.out.println("Prathamesh"+back_space+"Gurav");
        System.out.println( " ----- ");

        System.out.println("Prathamesh is "+carriage_return+"Gurav");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");
    }
}
