package SarkicilarProjesi;

import java.util.Scanner;

public class App {
    private static Sarkicilar sarkicilar = new Sarkicilar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleri_bastir(){
        System.out.println("\t 0-İslemleri Goruntule");
        System.out.println("\t 1-Sarkicilari Goruntule");
        System.out.println("\t 2-Sarkici Ekle");
        System.out.println("\t 3-Sarkici Guncelle");
        System.out.println("\t 4-Sarkici Sil");
        System.out.println("\t 5-Sarkici Bul");
        System.out.println("\t 6-Uygulamadan Cik");
    }

    public static void sarkicilari_goruntule(){
        sarkicilar.sarkicilari_bastir();
    }

    public static void sarkici_ekle(){
        System.out.print("Eklemek istediginiz sarkicinin ismi: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ekle(isim);
    }

    public static void sarkici_guncelle(){
        System.out.print("Guncellemek istediginiz pozisyon(1,2,3...): ");
        int pozisyon = scanner.nextInt();
        scanner.nextLine();  // enter'ı input olarak algilamamasi icin
        System.out.print("Yeni ismi girin: ");
        String yeni_isim = scanner.nextLine();
        sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
    }

    public static void sil(){
        System.out.print("Silmek istediginiz pozisyon(1,2,3...): ");
        int pozisyon = scanner.nextInt();
        sarkicilar.sarkici_sil(pozisyon-1);
    }

    public static void ara(){
        System.out.print("Aramak istediginiz sarkici: ");
        String isim = scanner.nextLine();
        sarkicilar.sarkici_ara(isim);
    }

    public static void main(String[] args) throws Exception {

        System.out.println("\t Sarkici Uygulamasina Hosgeldiniz!");
        islemleri_bastir();
        
        boolean cikis = false;
        int islem;

        while(!cikis){
            System.out.println("Bir islem seciniz..");
            islem = scanner.nextInt();
            scanner.nextLine();
            switch(islem){
                case 0:
                    islemleri_bastir();
                    break;
                case 1:
                    sarkicilari_goruntule();
                    break;
                case 2:
                    sarkici_ekle();
                    break;
                case 3:
                    sarkici_guncelle();
                    break;
                case 4: 
                    sil();
                    break;
                case 5:
                    ara();
                    break;
                case 6:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor...");
                    break;
            }
        }
    }
}