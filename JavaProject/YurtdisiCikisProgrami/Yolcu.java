package YurtdisiCikisProgrami;

import java.util.Scanner;

public class Yolcu implements YurtdisiKurallari{

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatirdiginiz Harc Bedeli: ");
        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Herhangi bir siyasi yasağınız bulunuyor mu?(evet ya da hayır giriniz!)");
        String cevap = scanner.nextLine();
        if(cevap.equals("evet")){
            this.siyasiYasak = true;
        }else{
            this.siyasiYasak = false;
        }

        System.out.print("Vizeniz bulunuyor mu?(evet ya da hayır giriniz!)");
        String cevap2 = scanner.nextLine();
        if(cevap2.equals("evet")){
            this.vizeDurumu = true;
        }else{
            this.vizeDurumu = false;
        }

    }

    @Override
    public boolean yurtDisiHarciKontrol() {
        if(this.harc < 200){
            System.out.println("Lutfen yurtdisi çikis harcini eksiksiz yatirin.");
            return false;
        }else{
            System.out.println("Yurtdisi harci islemi tamam.");
            return true;
        }
    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(this.siyasiYasak){
            System.out.println("Siyasi yasaginiz bulunuyor. Yurt disina cikamazsiniz!");
            return false;
        }else{
            System.out.println("Siyasi yasaginiz bulunmuyor.");
            return true;
        }
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu){
            System.out.println("Vize islemleri tamam");
            return true;
        }else{
            System.out.println("Gideceginiz ulkeye vizeniz bulunmamaktadir.");
            return false;
        }
    }
    
}
