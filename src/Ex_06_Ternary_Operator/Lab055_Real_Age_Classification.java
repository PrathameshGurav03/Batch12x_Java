package Ex_06_Ternary_Operator;

public class Lab055_Real_Age_Classification {

    public static void main(String[] args) {

        // Real age classification based on age number
        // age = 23 -> Adult  ( age > 18) , Minor (age  <18), Senior ( age > 65)

        String user_input = args[4];
        //System.out.println(user_input instanceof String); //Boolean result
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "Pratham"
        System.out.println(age);

        String result= (age < 18) ? "Minor": ( age < 65 )? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}
