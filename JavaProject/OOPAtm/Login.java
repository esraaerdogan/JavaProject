package OOPAtm;
import java.util.Scanner;

public class Login {

    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kullanici Adiniz: ");
        String k_adi = scanner.nextLine();
        System.out.print("Parolaniz: ");
        String parola = scanner.nextLine();
        if(hesap.getKullanici_adi().equals(k_adi) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }
    } 
}