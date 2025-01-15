package BeybladeProjesi;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Polymorphizm kullanarak Beyblade Programi

        System.out.println("Beyblade Programina Hosgeldiniz...");
        System.out.println("Cikis icin q'ya basin.");
        
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Hangi Beyblade'i uretmek istiyorsunuz?");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan cikiliyor..");
                break;
            }
            else{
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem); // beyblade nesnesi çok bicimlilik gosteriyor
                if(beyblade == null){
                    System.out.println("Lütfen gecerli bir beyblade ismi girin.");
                }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
            }
        }

    }
}