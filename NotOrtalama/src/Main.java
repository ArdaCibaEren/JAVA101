import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik notunu giriniz: ");
        fizik = inp.nextInt();
        System.out.println("Türkçe notunu giriniz: ");
        turkce = inp.nextInt();
        System.out.println("Kimya notunu giriniz: ");
        kimya = inp.nextInt();
        System.out.println("Müzik notunu giriniz: ");
        muzik = inp.nextInt();

        mat = mat > 0 && mat <= 100 ? mat : 0;
        fizik = fizik > 0 && fizik <= 100 ? fizik : 0;
        kimya = kimya > 0 && kimya <= 100 ? kimya : 0;
        muzik = muzik > 0 && muzik <= 100 ? muzik : 0;
        turkce = turkce > 0 && turkce <= 100 ? turkce : 0;

        double ortalama;
        ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println("Ortalama =" + ortalama);

        if (ortalama <= 55) {
            System.out.println("Maalesef sınıfta kaldınız.");
        } else System.out.println("Tebrikler, sınıfı geçtiniz.");
    }
}