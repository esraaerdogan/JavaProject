import java.util.Scanner;

public class yakitTutariHesaplama {

    public static void main(String[] args) {
        /*
            Bir aracin kilometrede ne kadar yaktigi ve kac kilometre yol yaptigi bilgilerini 
            alan ve suruculerin toplam ne kadar odemesi gerektigini hesaplama
        */
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Araciniz kilometrede kac tl yakiyor?(Ornek: 1,32)   :");
            double kurus=scanner.nextDouble();
            
            System.out.print("Aracinizla kac kilometre yol gittiniz?  :");
            int km=scanner.nextInt();
            
            System.out.println("Toplam odemeniz gereken tutar: "+ (kurus*km) +"tl'dir.");
        }
    }

}
