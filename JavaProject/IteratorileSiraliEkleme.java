import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorileSiraliEkleme {
     public static void listeyiBastir(LinkedList<String> gidilecek_yerler){
        
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni){  // alfabetik olarak sıralama

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while(iterator.hasNext()){

            int karsilastir = iterator.next().compareTo(yeni); // iterator ın gosterdigi degerle kıyaslama islemi
            
            if(karsilastir == 0){
                // ıkı deger esit
                System.out.println("Listenizde bu eleman zaten var!");
                return;  // sadece metodu sonlandirmak icin kullandik
            }
            else if(karsilastir < 0){
                
                // yeni nin degeri iterator.next ten buyukse
            
            }
            else if(karsilastir > 0){

                // yeninin degeri iterator.nextten daha kucukse sıfırdan buyuk
                iterator.previous(); // iterator bir geri gelicek.
                iterator.add(yeni);

                return;
            }
        }
        iterator.add(yeni);

    }
    
    public static void main(String[] args) throws Exception {

        // bos baslattigimiz bir linkedliste sıralı değer atama islemi:

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        sirali_ekle(gidilecek_yerler, "Postane");
        sirali_ekle(gidilecek_yerler, "Market");
        sirali_ekle(gidilecek_yerler, "Ev");

        listeyiBastir(gidilecek_yerler);

        /*
        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Ev");

        // gidilecek_yerler.add(2, "Alısveris Merkezi");

        gidilecek_yerler.remove(1);

        listeyiBastir(gidilecek_yerler);
        */

    }
}
