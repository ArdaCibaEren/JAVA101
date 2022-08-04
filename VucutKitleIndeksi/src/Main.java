import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    double boy, kg, indeks;

    Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu metre cinsinde giriniz. ");
        boy = input.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz. ");
        kg = input.nextDouble();
        indeks = (kg/(boy*boy));
        System.out.println("Vücut kitle indeksiniz : " + indeks);
    }
}
