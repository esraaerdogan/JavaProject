package InterfaceOrnek1;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        // IMuhendis muhendis1 = new IMuhendis();

        // YazilimMuhendisi muhendis1 = new YazilimMuhendisi(false, false);
        IMuhendis muhendis1 = new YazilimMuhendisi(false, false);
        
        muhendis1.askerlikDurumuSorgula();
        muhendis1.adliSicilSorgula();
        System.out.println(muhendis1.mezuniyetOrtalamasi(3.07));
        String[] tecrube1 = {"Vestel", "Havelsan", "Turksat"};
        muhendis1.isTecrubesi(tecrube1);
        

        // IMuhendis muhendis2 = new MakineMuhendisi(true,false);
        // ((MakineMuhendisi)muhendis2).referansGetir(referans2);

        // Interface teki metodlara ek olarak referansGetir metodunu kullanılırsa 
        // IMuhendisten referans olusturmak hata verir. Bu islemin hata vermemesi icin 
        // Interface'te olmayan metodu, MakineMuhendisi sınıfı referansına donusturebiliriz. 
        
        // Tur donusumu yapmamak icin MakineMuhendisinden nesne olusturmak gerekir.

        MakineMuhendisi muhendis2 = new MakineMuhendisi(true,false);

        String[] tecrube2 = {};
        String[] referans2 = {"Mustafa Murat Coskun", "Serhat Say"};

        muhendis2.askerlikDurumuSorgula();
        muhendis2.adliSicilSorgula();
        System.out.println(muhendis2.mezuniyetOrtalamasi(2.31));
        muhendis2.isTecrubesi(tecrube2);
        muhendis2.referansGetir(referans2);
        muhendis2.calis();

    }
}