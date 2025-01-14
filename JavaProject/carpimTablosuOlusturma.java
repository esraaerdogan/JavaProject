public class carpimTablosuOlusturma {
    public static void main(String[] args) throws Exception {
        // ic ice for dongusu kullanarak bir carpim tablosu olusturma
        for(int i = 0; i < 10; i++){
            System.out.println(i + " ile carpim: ");
            for(int j = 0; j < 10; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
            System.out.println("*********************");
        }
    }

}
