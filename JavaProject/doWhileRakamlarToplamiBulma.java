import java.util.Scanner;

public class doWhileRakamlarToplamiBulma {
    public static void main(String[] args) throws Exception {
        
        // do-while ile bir sayinin rakamlari toplamini bulan uygulama:
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Sayi gir:");
            int sayi = scanner.nextInt();
            int toplam = 0;
            do{
                toplam += sayi % 10;
                sayi /= 10;
                //System.out.println("sayi: " + sayi);
            }while(sayi > 0);
            System.out.println("Toplam: " + toplam);
        }
    }    
}