import java.time.LocalTime;
import java.util.Scanner;

public class taksimetreUygulamasi {
    public static void main(String[] args) {
        /*
         * Taksimetre kilometre başına 20.32 tl tutuyor.
         * Kısa Mesafe tutarı 100 tl. (100 tl altındaki ücretlerde yine 100 tl alınacaktır.)
         * Taksimetre açılış ücreti 20 tl.
         * Gece Tarifesi: 22:00 - 06:00 saatleri arasında %50 zam.
         */

        final int acilisUcreti = 20;
        final double kmBasinaUcret = 20.32;
        final double minUcret = 100;
        final double geceZamOrani = 1.5;

        Scanner scanner = new Scanner(System.in);
        double km;

        while (true) {
            System.out.print("Gidilen KM: ");
            km = scanner.nextDouble();

            if (km > 0) {
                break;
            } else {
                System.out.println("Hata: KM değeri 0 veya negatif olamaz. Lütfen geçerli bir değer girin.");
            }
        }

        double ucret = acilisUcreti + (km * kmBasinaUcret);

        LocalTime simdikiSaat = LocalTime.now();
        boolean geceTarifesi = (simdikiSaat.getHour() >= 22 || simdikiSaat.getHour() < 6);

        if (geceTarifesi) {
            ucret *= geceZamOrani;
            System.out.println("Gece tarifesi uygulanmıştır.");
        }

        if(ucret < minUcret){
            ucret = minUcret;
        }

        System.out.println("Taksimetre: " + ucret + " TL");
        scanner.close();    

    }
}
