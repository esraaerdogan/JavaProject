import java.util.Scanner;

public class kullaniciGirisKontrolu {
    public static void main(String[] args) throws Exception {
        
        //while dongüsü ile bir kullanıcı giirşi yazmaya çalışalım.

        Scanner scanner = new Scanner(System.in);
        int giris_hakki = 3;
        String sys_kullanici_adi = "Mustafa Murat";
        String sys_parola = "12345";

        System.out.println("*******************************");
        System.out.println("Kullanici Girisine Hosgeldiniz!");
        System.out.println("*******************************");

        while(true){
            System.out.print("Kullanici Adi: ");
            String kullanici_adi = scanner.nextLine();
            System.out.print("Parola: ");
            String parola = scanner.nextLine();
            if(kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Hosgeldiniz, " + kullanici_adi);
                break;
            }
            else if(kullanici_adi.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                System.out.println("Parolaniz Yanlis...");
                giris_hakki -= 1;
                System.out.println("Giris Hakki: " + giris_hakki);
            }
            else if(!kullanici_adi.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                System.out.println("Kullanici Adiniz Yanlis...");
                giris_hakki -= 1;
                System.out.println("Giris Hakki: " + giris_hakki);
            }
            else{
                System.out.println("Kullanici Adniz ve Parolaniz Yanlis...");
                giris_hakki -= 1;
                System.out.println("Giris Hakki: " + giris_hakki);
            }
            if(giris_hakki == 0){
                System.out.println("Giris Hakkiniz Bitti. Tekrar Bekleriz.");
                break;
            }
        } 
    }
}
