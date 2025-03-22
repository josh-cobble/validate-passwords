import java.util.Scanner;

public class validatepassword {

public static void main(String[] args) {

System.out.println("\nWelcome to the password validator!");

passwordRequirements();
    
Scanner scanner = new Scanner(System.in);

boolean pwLowerCase = false;
boolean pwUpperCase = false;
boolean pwNum = false;
boolean pwSymbols = false;

boolean run = true;

while (run) {

System.out.println("Enter 'exit' to exit the program or 'help' to view the password requirements.");

String password = scanner.nextLine();

if (password.equals("exit")) {
        run = false;
        System.out.println("Exit successful.");
        break;
}

if (password.equals("help")) {
        passwordRequirements();
        continue;
}

if (password.length() < 8) {
        System.out.println("\nYour password must be at least 8 characters. It should be between 8 to 16 characters (inclusive)\n");
}

if (password.length() > 16) {
        System.out.println("\nYour password must be less than 16 characters. It should be between 8 to 16 characters (inclusive)\n");
}

if (password.length() >= 8 && password.length() <= 16) {
        for (char i : password.toCharArray()) {
                if (Character.isLowerCase(i)) {
                        pwLowerCase = true;
                }
                if (Character.isUpperCase(i)) {
                        pwUpperCase = true;
                }
                if (Character.isDigit(i)) {
                        pwNum = true;
                }
                if (!(Character.isLetterOrDigit(i)))
                        pwSymbols = true;
                
                }

                }

        if ((pwLowerCase && pwUpperCase && pwNum) || (pwLowerCase && pwUpperCase && pwSymbols) ||
                (pwLowerCase && pwNum && pwSymbols) || (pwUpperCase && pwNum && pwSymbols)) {
                System.out.println("\nYour password validates the requirements. You may enter another password.\n");
        }
        else {
                System.out.print("\nPlease enter a valid password.\n");
        }

        pwLowerCase = false;
        pwUpperCase = false;
        pwNum = false;
        pwSymbols = false;


}

scanner.close();

}

public static void passwordRequirements() {
        System.out.println("Please enter a password with 8 to 16 characters (inclusive) containing at least 3 out of 4 of the following categories:\n");
        System.out.println("(1) lower case letters, i.e., a-z\n");
        System.out.println("(2) upper case letters, i.e., A-Z\n");
        System.out.println("(3) numbers, i.e., 0-9\n");
        System.out.println("(4) the following special symbols: ~!@#$%^&*()-=+_ */\n");
        }


}
