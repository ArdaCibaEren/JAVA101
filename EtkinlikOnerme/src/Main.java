import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen sıcaklık değerini giriniz.");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        }
        if (heat >= 5 && heat <= 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        if (heat >= 15 && heat <= 25) {
            System.out.println("Piknik yapabilirsiniz.");
        }
        if (heat > 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
