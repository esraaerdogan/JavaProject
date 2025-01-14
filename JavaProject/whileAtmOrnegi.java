import java.util.Scanner;

public class whileAtmOrnegi {
    public static void main(String[] args) throws Exception {
        /*
         While dongusu kullanarak ATM programi yapalim.
         Islemler
         1. ıslem: Bakiye Ogrenme
         2. ıslem: Para Cekme
         3. ıslem: Para Yatirma
         Cikis: q
        */

        String islemler = "Islemler\n1.islem: Bakiye Ogrenme\n2.islem: Para Cekme\n3.islem: Para Yatirma\nCikis icin q'ya basin";
        try (Scanner scanner = new Scanner(System.in)) {
            int bakiye = 1000;

            System.out.println("************************************");
            System.out.println(islemler);
            System.out.println("************************************");

            while(true){

                System.out.print("Islem seciniz: ");
                String islem = scanner.nextLine();

                if(islem.equals("q")){
                    System.out.println("Islem sonlandirildi");
                    break;
                }
                else if(islem.equals("1")){
                    System.out.println("Bakiyeniz: " + bakiye);
                }
                else if(islem.equals("2")){
                    System.out.print("Cekmek istediginiz para tutari: ");
                    int paracekme = scanner.nextInt();
                    scanner.nextLine();
                    if(bakiye-paracekme < 0){
                        System.out.println("Yetersiz Bakiye.\nBakiyeniz: " + bakiye);
                        continue;
                    }
                    bakiye -= paracekme;
                    System.out.println(paracekme + " Tl verildi.\nBakiyeniz: " + bakiye);
                }
                else if(islem.equals("3")){
                    System.out.print("Yatirmak istediginiz para tutari: ");
                    int parayatirma = scanner.nextInt();
                    scanner.nextLine();
                    bakiye += parayatirma; 
                    System.out.println(parayatirma + " Tl yatirildi.\nBakiyeniz: " + bakiye);
                }
                else{
                    System.out.println("Islem gecersiz");
                }
            }
        }
    }
}
