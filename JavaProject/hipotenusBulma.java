import java.util.Scanner;

public class hipotenusBulma {
    
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Dik ucgenin Birinci Kenarini Giriniz: ");
            int a=scanner.nextInt();
            System.out.print("Dik ucgenin Ikinci Kenarini Giriniz: ");
            int b=scanner.nextInt();
            
            double hipotenus=Math.sqrt(a*a+b*b);        
            System.out.println("Dik kenarlarini Girdiginiz Ucgenin Hipotenusu: "+hipotenus);
        }
        
    }
}