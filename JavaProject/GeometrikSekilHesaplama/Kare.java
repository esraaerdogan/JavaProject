public class Kare extends Sekil{
    private int kenar;
    
    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanHesapla() {
        int alan = kenar * kenar;
        System.out.println(getIsim() + " in alanı " + alan + " dır.");
    }
}