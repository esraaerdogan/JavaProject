import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String islemler = "İşlemler...\n"
                          + "1. Kare Alan Hesapla\n"
                          + "2. Üçgen Alan Hesapla\n"
                          + "3. Daire Alan Hesapla\n"
                          + "Çıkış için q'ya basın.";

        while(true){

            System.out.println(islemler);
            System.out.print("Hangi şeklin alanını hesaplamak istiyorsunuz : ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;           
            
            if(sekil_turu.equals("q")){
                System.out.println("Programdan Çıkılıyor.");
                break;
            }
            else if(sekil_turu.equals("1")){
                System.out.print("Karenin Kenarı : ");
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare 1", kenar);
                sekil.alanHesapla();   
            }
            else if(sekil_turu.equals("2")){
                System.out.print("Kenar 1 : ");
                int a = scanner.nextInt();
                System.out.print("Kenar 2 : ");
                int b = scanner.nextInt();
                System.out.print("Kenar 3 : ");
                int c = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen("Ucgen 1", a, b, c);
                sekil.alanHesapla();
            }
            else if(sekil_turu.equals("3")){
                System.out.print("Dairenin Yaricapi : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire 1", yaricap);
                sekil.alanHesapla();
            }else{
                System.out.println("Gecersiz Islem...");
            }
        }
    }   
}