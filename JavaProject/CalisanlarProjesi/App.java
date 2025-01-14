package CalisanlarProjesi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        Calisanlar Programi

        Calisan Sinifi Seklinde Bir Ust Sinif

        Calisan Sinifindan Tureyen Yazilimci adinda Bir Alt Sinif
        Calisan Sinifindan Tureyen Yonetici adinda Bir Alt Sinif
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calisanlar Programina Hosgeldiniz...");
        String islemler = "Islemler\n1. Yazilimci Islemleri\n2. Yonetici Islemleri\n" +
        "Cikis icin q'ya basin.";
        System.out.println("*******************************");
        System.out.println(islemler);
        System.out.println("*******************************");

        while(true){
            System.out.print("Islemi Seciniz..");
            String islem = scanner.nextLine();

            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor.");
                break;
            }

            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Ali", "Veli", 11, "Java, Python, C");
                String yazilimci_islem = "Yazilimci Islemleri\n1. Format At\n2. Bilgileri Goster\nCikis icin q'ya basin.";
                System.out.println(yazilimci_islem);
                while(true){
                    System.out.print("Islemi Seciniz..");
                    String yaz_islem = scanner.nextLine();
                    if(yaz_islem.equals("q")){
                        System.out.println("Yazilimci Islemlerinden Cikiliyor.");
                        break; // sadece icinde bulundugu donguyu sonlandirir!
                    }
                    else if(yaz_islem.equals("1")){
                        System.out.print("Isletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                    }
                    else if(yaz_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{ System.out.println("Gecersiz Yazilimci Islemi.."); }
                }
            }

            else if(islem.equals("2")){
                Yonetici yonetici = new Yonetici("Zeynep", "Aksoy", 8, 10);
                String yonetici_islem = "Yonetici Islemleri\n1. Zam Yap\n2. Bilgileri Goster\nCikis icin q'ya basin.";
                System.out.println(yonetici_islem);
                while(true){
                    System.out.print("Islemi Seciniz..");
                    String yon_islem = scanner.nextLine();
                    if(yon_islem.equals("q")){
                        System.out.println("Yonetici Islemlerinden Cikiliyor.");
                        break;
                    }
                    else if(yon_islem.equals("1")){
                        System.out.print("Zam Yapmak Istediginiz Miktar: ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktari);
                    }
                    else if(yon_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else{ System.out.println("Gecersiz Yonetici Islemi.."); }
                }
            }
            else{ System.out.println("Gecersiz Islem.."); }
        }
    }
}
