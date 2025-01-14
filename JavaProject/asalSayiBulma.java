import java.util.Scanner;

public class asalSayiBulma {
    
    public static boolean asalMi(int sayi){
        for(int i=2; i<sayi ; i++){
            if(sayi % i == 0){
                return false;
            }
        }
        return true;
    } 
    public static void main(String[] args) throws Exception {
        /*
            1'den 1000'e kadar olan sayilardan asal olanlari ekrana yazdirma
            Asal sayi: 1'e ve kendisinden baska hicbir sayiya bolunemeyen sayilardir.
        */

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Baslangic: ");
            int baslangic = scanner.nextInt();
            System.out.print("Son: ");
            int son = scanner.nextInt();

            for(;baslangic<=son;baslangic++){
                if(baslangic == 1){
                    continue;
                }
                if(asalMi(baslangic)== true){
                    System.out.println(baslangic);
                }
            }
        }
    }
}