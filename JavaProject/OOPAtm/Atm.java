package OOPAtm;
import java.util.Scanner;

public class Atm {

    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamiza Hosgeldiniz!");
        System.out.println("****************************");
        System.out.println("Kullanici Girisi");
        System.out.println("****************************");
        int giris_hakki = 3;

        while(true){
            if(login.login(hesap) == true){
                System.out.println("Hosgeldin " + hesap.getKullanici_adi());
                break;
            }else{
                System.out.println("Giris Basarisiz...");
                giris_hakki -= 1;
                System.out.println("Kalan giris hakki: " + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giris Hakkiniz Doldu.");
                return; // calis metodunu durdurmak icin.
            }
        }
        System.out.println("****************************");
        String islemler = "Islemler\n1.islem: Bakiye Goruntule\n2.islem: Para Yatirma\n"
                            + "3.islem: Para Cekme\nCikis icin q'ya basin";
        System.out.println(islemler);
        System.out.println("****************************");

        while(true){
            System.out.print("Islem seciniz: ");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                break;
            }
            else if(islem.equals("1")){
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.print("Yatirmak istediginiz para tutari: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar); 
            }
            else if(islem.equals("3")){
                System.out.print("Cekmek istediginiz para tutari: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }else{
                System.out.println("Gecersiz Islem");
            }
        }
    }
}