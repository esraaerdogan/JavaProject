import java.util.Scanner;

public class armstrongSayisiBulma {
    
    // Girilen bir sayinin armstrong sayisi olup olmadigini bulma
        
    /*
    Ornegin, 4 basamakli bir sayinin armstrong sayisi olmasi icin su sarti saglamasi gerekir.
    1634 = 1^4 + 6^4 + 3^4 + 4^4 (Buradaki 4, basamak sayisi)
    371 = 3^3 + 7^3 + 1^3 (Buradaki 3, basamak sayisi)

    Bu programi do while dongusu ile yapalim:
    */
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sayi gir: ");
            int sayi = scanner.nextInt();
            int sayi2 = sayi, sayi3 = sayi; // sayi2 ve sayi3 gecici kullanilacak sayilar
            int basamak = 0;

            // basamak sayisini bulmak icin do while
            do{
                sayi2 /= 10;
                basamak ++; 
            }while(sayi2>0);

            int toplam = 0;

            // armstrong sayi olup olmadigini hesaplamak icin do while
            do{
                int kalan = sayi3 % 10;
                sayi3 /= 10;
                toplam += Math.pow(kalan, basamak);
            }while(sayi3>0);

            if(toplam == sayi){
                System.out.println("Girdiginiz sayi armstrong sayidir.");
            }else{
                System.out.println("Girdiginiz sayi armstrong sayi degildir. ");
                System.out.println("Basamak: " + basamak);
                System.out.println("Toplam: " + toplam);
            }
        }
    }
}