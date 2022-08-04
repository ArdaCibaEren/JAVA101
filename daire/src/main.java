import java.util.Scanner;
public class main {
    public static void main(String[] args){
        int r,a;
        double cevre, alan, dilimalani, pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yarıçapını giriniz. ");
        r = input.nextInt();
        System.out.println("Merkez açının ölçüsünü giriniz. ");
        a = input.nextInt();
        alan = (pi * r * r);
        cevre = (2 * pi * r);
        dilimalani = (pi * (r * r) * a)/360;

        System.out.println("Daire diliminin alanı " + dilimalani);
        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi :" + cevre);
    }
}
