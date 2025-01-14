package idmanUygulamasi;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // idman olusturma programi

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Idman Programina Hosgeldiniz!");
        String idmanlar = "Gecerli Hareketler...\nBurpee\nPushup(Sinav)\nSitup(Mekik)\nSquat";
        System.out.println(idmanlar);
        System.out.println("Bir idman Olusturun!");
        System.out.print("Burpee Sayisi: ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup Sayisi: ");
        int pushup = scanner.nextInt();
        System.out.print("Situp Saysi: ");
        int situp = scanner.nextInt();
        System.out.print("Squat Sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();  // intten sonra bir tane nextline eklemeliyiz.

        idman idman = new idman(burpee,pushup,situp,squat);
        System.out.println("Idmaniniz Basliyor....");

        while(idman.idmanBittiMi() == false){  // idman bitmedigi surece
            System.out.print("Hareket Tekrari(Burpee,Pushup,Situp,Squat) : ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kac tane yapacaksiniz?");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur, sayi);
        }
        System.out.println("Idmanini basariyla bitirdin...");
    }
}
