import java.util.Scanner;
public class main {
    public static void main(String[] args){
    int x,y,z,u;
    double alan;

    Scanner inp = new Scanner(System.in);
    System.out.print("Üçgenin 1. kenar uzunluğunu giriniz. ");
    x = inp.nextInt();
    System.out.print("Üçgenin 2. kenar uzunluğunu giriniz. ");
    y = inp.nextInt();
    System.out.print("Üçgenin 3. kenar uzunluğunu giriniz. ");
    z = inp.nextInt();

    u = (x + y + z) / 2;
    alan = Math.sqrt(u*(u-x)*(u-y)*(u-z));
    System.out.println("Üçgenin alanı : " + alan);
    }
}
