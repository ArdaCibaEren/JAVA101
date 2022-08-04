import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        double toplam, armutkilo, elmakilo, domateskilo, muzkilo, patlicankilo, armut=2.14, elma=3.67, domates=1.11, muz=0.95,patlican=5;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo? ");
        armutkilo = input.nextDouble();
        System.out.println("Elma kaç kilo? ");
        elmakilo = input.nextDouble();
        System.out.println("Domates kaç kilo? ");
        domateskilo = input.nextDouble();
        System.out.println("Muz kaç kilo? ");
        muzkilo = input.nextDouble();
        System.out.println("Patlıcan kaç kilo? ");
        patlicankilo = input.nextDouble();
        toplam = (armut*armutkilo)+(elma*elmakilo)+(domates*domateskilo)+(muz*muzkilo)+(patlican*patlicankilo);
        System.out.println("Toplam tutar : " + toplam);
    }
}
