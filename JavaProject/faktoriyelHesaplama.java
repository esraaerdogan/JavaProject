import java.util.Scanner;

public class faktoriyelHesaplama {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Faktoriyelini Hesaplamak Istediginiz Sayiyi Girin:");
            int sayi = scanner.nextInt();
            int faktoriyel = 1;

            //For ile faktoriyel hesabi:
            for(int i = 1; i<=sayi ; i++){
                faktoriyel *= i  ;
            }
            System.out.println("(for)Sonuc :" + faktoriyel);

            //While ile faktoriyel hesabi:
            faktoriyel = 1;
            while(sayi>0){
                faktoriyel *= sayi;
                sayi--;
            }
            System.out.println("(while)Faktoriyel: " + faktoriyel);
        }
    }
}