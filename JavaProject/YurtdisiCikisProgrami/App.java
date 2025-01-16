package YurtdisiCikisProgrami;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Istanbul Havalimani'na Hos Geldiniz!..");

        String sartlar = "Yurtdisi Cikis Kurallari..\n"
                        +"Herhangi bir siyasi yasaginizin bulunmamasi gerekiyor..\n"
                        +"200TL harc bedelinizi tam olarak yatirmaniz gerekiyor..\n"
                        +"Gideceginiz ulkeye vizenizin bulunmasi gerekiyor..";
        String message = "Yurtdisi sartlarindan hepsini sağlamaniz gerekiyor.";

        while(true){
            System.out.println("*************************************");
            System.out.println(sartlar);
            System.out.println("*************************************");

            Yolcu yolcu = new Yolcu();

            System.out.println("Harc Bedeli Kontrol Ediliyor");
            Thread.sleep(3000);

            if(yolcu.yurtDisiHarciKontrol()==false){
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi Yasak Durumu Kontrol Ediliyor");
            Thread.sleep(3000);

            if(yolcu.siyasiYasakKontrol()==false){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize Durumu Kontrol Ediliyor");
            Thread.sleep(3000);

            if(yolcu.vizeDurumuKontrol()==false){
                System.out.println(message);
                continue;
            }

            System.out.println("Islemleriniz tamam. Yurtdisina cikabilirsiniz!..");
            break;
        }

    }
}
