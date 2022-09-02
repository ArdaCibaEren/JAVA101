import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i, largestNum = 0, smallestNum = 0;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz : ");
        n = inp.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(i + "Sayıyı giriniz : ");
            int number = inp.nextInt();

            if (number > largestNum) {
                largestNum = number;
            }
            if (number < smallestNum) {
                smallestNum = number;
            }
        }
        System.out.println("En büyük sayı : " + largestNum);
        System.out.println("En küçük sayı : " + smallestNum);
    }
}
//www.patika.dev