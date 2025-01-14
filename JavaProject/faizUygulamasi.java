import java.util.Scanner;

public class faizUygulamasi {
    public static void main(String[] args) throws Exception {
        /*
        Kullanicidan anapara degerini ve parasini kac yil vadeli yatirmak istedigi
        bilgisini alip her sene sonunda toplam para miktarini ekrana yazdiralim.

        Faiz Orani: % 6 Faiz Orani
        */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bankamiza Hosgeldiniz. Faiz Orani %6");
            int anapara, vade;
            System.out.print("Yatirmak istediginiz tutar: ");
            anapara = scanner.nextInt();
            System.out.print("Paranizi kac yil vadeli yatirmak istiyorsunuz?: ");
            vade = scanner.nextInt();

            double toplampara = anapara;
            double faziOrani = 0.06;

            for(int i = 1 ; i <= vade ; i++){
                toplampara += (toplampara * faziOrani) ;
                System.out.println(i + ".yilin sonunda toplam para: " + (int)toplampara);
            }
        }
    }

}
