import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App{
    
    public static void main(String[] args) {

        System.out.println("LGS YGS Birinci Bulma...");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç öğrenci gireceksiniz?");
        int ogrenciSayisi = scanner.nextInt();
        scanner.nextLine(); // Buffer temizleme

        List<EsitAgirlik> esitAgirlikListesi = new ArrayList<>();
        List<Sayisal> sayisalListesi = new ArrayList<>();

        for (int i = 0; i < ogrenciSayisi; i++) {

            System.out.print("Öğrenci Türü (1 - Eşit Ağırlık, 2 - Sayısal): ");
            int tur = scanner.nextInt();
            scanner.nextLine();

            System.out.print((i + 1) + ". Öğrenci İsmi: ");
            String isim = scanner.nextLine();

            System.out.print("Netler (Türkçe Matematik Edebiyat Fizik): ");
            int turkce = scanner.nextInt();
            int matematik = scanner.nextInt();
            int edebiyat = scanner.nextInt();
            int fizik = scanner.nextInt();
            scanner.nextLine(); 

            if (tur == 1) {
                esitAgirlikListesi.add(new EsitAgirlik(turkce, matematik, edebiyat, fizik, isim));
            } else if (tur == 2) {
                sayisalListesi.add(new Sayisal(turkce, matematik, edebiyat, fizik, isim));
            } else {
                System.out.println("Geçersiz seçim. Öğrenci kaydedilmedi.");
            }
        }
        
        // Eşit Ağırlık Birincisi
        if (!esitAgirlikListesi.isEmpty()) {
            EsitAgirlik birinciEsit = birinci(esitAgirlikListesi);
            System.out.println("Birinci Eşit Ağırlık Öğrencisi: " + birinciEsit.getIsim());
            System.out.println("Puanı: " + birinciEsit.puanHesapla());
        } else {
            System.out.println("Eşit Ağırlık öğrencisi yok.");
        }

        // Sayısal Birincisi
        if (!sayisalListesi.isEmpty()) {
            Sayisal birinciSayisal = birinci(sayisalListesi);
            System.out.println("Birinci Sayısal Öğrencisi: " + birinciSayisal.getIsim());
            System.out.println("Puanı: " + birinciSayisal.puanHesapla());
        } else {
            System.out.println("Sayısal öğrencisi yok.");
        }
    }

    public static <E extends Aday> E birinci(List<E> adayListesi) {
        if (adayListesi.isEmpty()) {
            return null;
        }

        E enYuksekPuanli = adayListesi.get(0); // İlk öğrenci varsayılan olarak en yüksek kabul edildi

        for (E aday : adayListesi) {
            if (aday.puanHesapla() > enYuksekPuanli.puanHesapla()) {
                enYuksekPuanli = aday;
            }
        }
        return enYuksekPuanli;
    }

}