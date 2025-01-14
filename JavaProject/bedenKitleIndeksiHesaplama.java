import java.util.Scanner;

public class bedenKitleIndeksiHesaplama {

    public static void main(String[] args) {
        /*
            Kullanicidan alinan boy ve kilo degerlerine gore beden kitle indeksi hesaplama
            Beden kitle indeksi: kilo / boy (m) * boy (m) 

            BKI 18.5 ' un altindaysa       ----->  Zayif
            BKI 18.5 ile 25 arasindaysa    ----->  Normal
            BKI 25 ile 30 arasindaysa      ----->  Fazla Kilolu
            BKI 30 ' un uzerindeyse        ----->  Obez
        */
        
        System.out.println("Beden Kitle Indeksi Hesaplama");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Lutfen Boyunuzu (metre cinsinden) Giriniz: ");
            double boy=scanner.nextDouble();
            System.out.print("Lutfen Kilonuzu (kilogram cinsinden) Giriniz: ");
            int kilo=scanner.nextInt();
     
            double indeks=kilo/(boy*boy);
            System.out.println("Beden Kitle Indeksiniz: "+indeks);

            if(indeks < 18.5){
                System.out.println("\n\n\tZAYIFSINIZ.\n\n");
            }
            else if(indeks >= 18.5 && indeks < 25 ){
                System.out.println("\n\n\tNORMAL KILODASINIZ.\n\n");
            }
            else if(indeks >= 25 && indeks < 30){
                System.out.println("\n\n\tFAZLA KILOLUSUNUZ.\n\n");
            }
            else{
                System.out.println("\n\n\tOBEZSİNİZ.\n\n");
            }
        }
    }
}