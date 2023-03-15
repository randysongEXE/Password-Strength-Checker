
import java.util.Scanner;

public class PasswordChecker {
    private static final int SENTINEL = -1;

    //main method reads user input and runs it against boolean methods to check if the password is strong or weak.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter password, or -1 to exit. : ");
            String password = scanner.nextLine();
            if (password.equals(String.valueOf(SENTINEL))) {
                System.out.println("Exiting...");
                break;
            }


            boolean isStrong = isStrongPassword(password);


            if (isStrong) {
                System.out.println("Password is strong!");
            } else
                System.out.println("Password is weak.");


        }
        scanner.close();
    }


    //This method uses a series of if-statements to check against various methods
    public static boolean isStrongPassword(String password) {

        ContainsVars cv = new ContainsVars();
        DictionaryCheck dc = new DictionaryCheck();
        BruteForceCheck bc = new BruteForceCheck();


        //checking various methods
        if (password.length() <= 8) {
            return false;
        }
        if (!(cv.containsUpperCase(password))) {
            return false;
        }
        if (!(cv.containsLowerCase(password))) {
            return false;
        }
        if (!(cv.containsDigit(password))) {
            return false;
        }
        if (!(cv.containsSpecialChar(password))) {
            return false;
        }
        if (dc.dictionaryCheck(password)) {
            return false;
        }
        return !bc.bruteForceCheck(password);
    }
}




