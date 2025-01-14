package OOPAtm;

public class App {
    public static void main(String[] args) throws Exception {
        // Object Oriented(Nesne Yonelimli) ATM Programi
        // Login Class'i Kullanici Girisini Kontrol Edecek.
        // Hesap Class'i Hesap Islemlerini Yapacak.
        // ATM ise atmyi calistiricak.
        
        Atm atm = new Atm();
        Hesap hesap = new Hesap("Ali", "12345", 1000);
        atm.calis(hesap);
        System.out.println("Programdan Cikiliyor...");
    }
}