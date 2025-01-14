import java.util.Scanner;

public class ifelseAtmOrnegi {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("1-PARA CEKME");
            System.out.println("2-PARA YATIRMA");
            System.out.println("3-HAVALE YAPMA");
            System.out.println("4-KART IADE\n\n");
            System.out.print("Lutfen Yapacaginiz Islemi Girin: ");
            int islem=scanner.nextInt();
            int bakiye=1000;
            
            if(islem == 1){
                System.out.println("\nBakiyeniz: "+bakiye);
                
                System.out.print("Cekmek Istediginiz Tutari Giriniz:   ");
                double cekme=scanner.nextDouble();
                if(cekme > bakiye){
                     System.out.println("\n\n\tBAKIYE YETERSIZ!!!\n\n");
                }
                else{
                    System.out.println("Hesabinizda Kalan Paraniz: "+(bakiye-cekme)+"\n");
                }
            }
            else if(islem == 2){
                System.out.println("\nBakiyeniz: "+bakiye);
                
                System.out.print("Yatirmak Istediginiz Tutari Giriniz:   ");
                double yatirma=scanner.nextDouble();
                System.out.println("Yeni Bakiyeniz: "+(bakiye+yatirma)+"\n");
            }
            else if(islem == 3){
                System.out.println("\nBakiyeniz: "+bakiye);
                
                System.out.print("Havale Yapmak Istediginiz Tutari Giriniz:   ");
                double havale=scanner.nextDouble();
                
                 if(havale < bakiye){
                     System.out.println("\n\tHavale Islemi Basariyla Gerceklestirilmistir.\n");
                     System.out.println("Yeni Bakiyeniz: "+(bakiye-havale)+"\n");
                }
                else{
                    System.out.println("\n\n\tBAKIYE YETERSIZ!!!\n\n");
                }
            }
            else if(islem == 4){
                System.out.println("Kartiniz Iade Edilmistir.\n");
            }
            else{
                System.out.println("Lutfen Yukaridaki Islemlerden Birini Seciniz!!!");
            }

        }
    }
}