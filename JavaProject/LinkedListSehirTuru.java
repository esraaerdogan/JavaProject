import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListSehirTuru {

    public static void islemleriBastir(){
        System.out.println("0 - Islemleri Goruntule..");
        System.out.println("1 - Bir Sonraki Sehre Git..");
        System.out.println("2 - Bir Onceki Sehre Git..");
        System.out.println("3 - Uygulamadan Cik..");
    }

    public static void sehirleriTurla(LinkedList<String> sehirler){
        
        ListIterator<String> iterator = sehirler.listIterator();

        int islem;

        islemleriBastir();

        Scanner scanner = new Scanner(System.in);

        if(!iterator.hasNext()){
            System.out.println("Herhangi bir sehir yok.");
        }
        boolean cikis = false;
        
        // iteratorda bir ileri bir geri veya bir geri bir ileri yapinca sıkıntı cıkıyor 
        // ileri degiskeni ile bu sorunu cozebiliriz
        boolean ileri = true;  

        while(!cikis){
            System.out.println("Bir islem seciniz..");
            islem = scanner.nextInt();
            switch(islem){
                case 0: 
                    islemleriBastir();
                    break;
                case 1: 
                    if(!ileri){
                        if(iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if(iterator.hasNext()){
                        System.out.println("Sehre gidiliyor.." + iterator.next());
                    }else{
                        System.out.println("Gidilecek Sehir Kalmadi.");
                        ileri = true;
                    }
                    break;
                case 2:
                    if(ileri){
                        if(iterator.hasNext()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if(iterator.hasPrevious()){
                        System.out.println("Sehre gidiliyor.." + iterator.previous());
                    }else{
                        System.out.println("Sehir turu basladi.");
                    }
                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan cikiliyor..");
                    break;
            }
        }
    }

    public static void main(String[] args) throws Exception {

        // LinkedListte sehirler olucak. Sehir turlama metodu ile sehirlerde 
        // iterator ile ileri geri gezinme

        LinkedList<String> sehirler = new LinkedList<String>();

        sehirler.add("Ankara");
        sehirler.add("Eskişehir");
        sehirler.add("Malatya");

        sehirleriTurla(sehirler);
    }
}
