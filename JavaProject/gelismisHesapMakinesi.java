import java.util.Scanner;

public class gelismisHesapMakinesi {
     public static int cikarma(int a,int b){
        if(a>=b){
            return (a-b);
        }else{
            System.out.println("Ikinci sayi birinci sayidan buyuk olamaz!");
            return 0;
        }
    }    
    public static double bolme(int a,int b){
        return ((double)a/b);
    }
    public static int toplama(int a,int b){
        return (a+b);
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int carpma(int a,int b){
        return (a*b);
    }
    public static int carpma(int a,int b,int c){
        return (a*b*c);
    }
    public static void main(String[] args) throws Exception {
        /*
         * Method overloading kullanrak bir tane hesap makinesi yapalım.
         * Toplama ve çarpma metodlarını 2 veya 3 parametre alacak şekilde tasarlayalım.
         */

        String islemler = "1-Toplama islemi\n2-Cikarma islemi\n3-Carpma islemi\n"
                        + "4-Bolme islemi\nCikis icin q'ya basin.";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while(true){
            System.out.print("Islemi Seciniz: ");
            Scanner scanner = new Scanner(System.in);
            String islem = scanner.nextLine();
            
            if(islem.equals("1")){
                System.out.print("Kac deger toplayacaksiniz? (2 veya 3): ");
                int kacsayi = scanner.nextInt();
                if(kacsayi==2 || kacsayi==3){
                    System.out.print("Birinci Sayi: ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci Sayi: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    if(kacsayi==2){
                        System.out.println("Toplam: " + toplama(a, b));
                    }
                    else if(kacsayi==3){
                        System.out.print("Ucuncu Sayi: ");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Toplam: " + toplama(a, b, c));
                    }
                }
                else{
                    System.out.println("Uygun Metod Bulunmuyor!");
                }
            }

            else if(islem.equals("2")){
                System.out.print("Birinci Sayi: ");
                int a = scanner.nextInt();
                System.out.print("Ikinci Sayi: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Fark: " + cikarma(a, b));
            }

            else if(islem.equals("3")){
                System.out.print("Kac deger carpacaksiniz? (2 veya 3): ");
                int kacsayi = scanner.nextInt();
                if(kacsayi==2 || kacsayi==3){
                    System.out.print("Birinci Sayi: ");
                    int a = scanner.nextInt();
                    System.out.print("Ikinci Sayi: ");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    if(kacsayi==2){
                        System.out.println("Carpim: " + carpma(a, b));
                    }
                    else if(kacsayi==3){
                        System.out.print("Ucuncu Sayi: ");
                        int c = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Carpim: " + carpma(a, b, c));
                    }
                }
                else{
                    System.out.println("Uygun Metod Bulunmuyor!");
                }
            }

            else if(islem.equals("4")){
                System.out.println("Birinci Sayi: ");
                int a = scanner.nextInt();
                System.out.println("Ikinci Sayi: ");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Bolme: " + bolme(a, b));
            }
            else if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else{
                System.out.println("İsleminiz Gecersiz!");
            }
        }
    }
}
