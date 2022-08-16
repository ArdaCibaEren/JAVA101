import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newpassword;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.println("Username :");
        userName = inp.nextLine();

        System.out.println("Password :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Successfully logged in.");
        } else {
            System.out.println("Wrong username or password.Would you like to reset your password?");
            System.out.println("1-Yes\n2-No");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Please enter your new password.");
                    newpassword = inp.next();
                    if (newpassword.equals("java123") || newpassword.equals(password)) {
                        System.out.println("Please choose a different password.");
                        newpassword = inp.next();
                    } else {
                        System.out.println("Password has changed.");
                    }
                    break;
                case 2:
                    System.out.println("Login cancelled.");
                    break;
            }
        }
    }
}
