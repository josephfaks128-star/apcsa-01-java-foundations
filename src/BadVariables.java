
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5; // Fixed: variable names cannot start with a number.

        double price = 9.99; // Fixed: a double needs a numeric value, not a String.

        boolean isReady = true; // Fixed: boolean values are true or false without quotes.

        char grade = 'A'; // Fixed: a char uses single quotes, not double quotes.

        int classNumber = 11; // Fixed: class is a reserved Java keyword.

        String name = "Sarah"; // Fixed: variable names should use camelCase, starting lowercase.

        int studentScore = 95; // Fixed: variable names cannot contain spaces.

        System.out.println("If this runs, you fixed them all.");
    }
}
