package Composition;

public class App {
    public static void main(String[] args) throws Exception {

        // Composition'ı anlamak icin sahiplik iliskisi gerektiren bilgisayar uygulamasi

        Resolution resolution = new Resolution(1920, 1080);
        Monitor monitor = new Monitor("VS197DE", "ASUS", "18.5", resolution);

        Kasa kasa = new Kasa("Shadow Blade", "Shadow", "Temperli Cam");

        Anakart anakart = new Anakart("B250-PRO", "Asus", 10, "Windows 10");

        Bilgisayar pc = new Bilgisayar(kasa, anakart, monitor);

        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("Ubuntu 16.04");
    }
}