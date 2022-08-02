import java.util.Scanner;
public class kdv {
    public static void main(String[] args){

        double fiyat, KDV8, KDV18, KDV8sonuc, KDV18sonuc;
        String sonuc8, sonuc18;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün fiyatını giriniz : ");
        fiyat = inp.nextDouble();

        KDV8sonuc = fiyat * 1.08;
        KDV18sonuc = fiyat * 1.18;
        KDV8 = fiyat * 0.08;
        KDV18 = fiyat * 0.18;
        sonuc8 = "KDV'siz fiyat : " + fiyat + "\nKDV'li fiyat : " + KDV8sonuc + "\nKDV tutarı : " + KDV8;
        sonuc18 = "KDV'siz fiyat : " + fiyat + "\nKDV'li fiyat : " + KDV18sonuc + "\nKDV tutarı : " + KDV18;

        System.out.println(fiyat < 1000 ? sonuc18 : sonuc8);
    }
}