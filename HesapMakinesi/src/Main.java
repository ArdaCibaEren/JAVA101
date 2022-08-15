import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, select;

        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        num1 = inp.nextInt();
        System.out.println("Please enter the second number : ");
        num2 = inp.nextInt();

        System.out.println("1-add\n2-subt\n3-multi\n4-div");
        System.out.println("Please choose any of the above");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Divided by zero error");
                } else System.out.println(num1 / num2);
                break;
        }
    }
}


