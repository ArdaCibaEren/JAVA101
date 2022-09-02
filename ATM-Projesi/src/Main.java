import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3, balance = 1500, select, price;

        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = inp.nextLine();
            System.out.println("Şifreniz : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Tutar giriniz :");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("İşlem başarılı, güncel bakiyeniz : " + balance);
                            break;
                        case 2:
                            System.out.println("Tutar giriniz :");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz. ");
                            } else {
                                balance -= price;
                                System.out.println("İşlem başarılı. Güncel bakiyeniz : " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Güncel bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke edilmiştir. Lütfen banka ile iletişime geçin.");
            } else {
                System.out.println("Kalan Hakkınız : " + right);
            }
        }
    }
}
//www.patika.dev
