package Composition;

public class Bilgisayar {
    private Kasa kasa;
    private Anakart anakart;
    private Monitor monitor;

    public Bilgisayar(Kasa kasa, Anakart anakart, Monitor monitor){
        this.kasa = kasa;
        this.anakart = anakart;
        this.monitor = monitor;
    }

    public Kasa getKasa() { return kasa; }
    public void setKasa(Kasa kasa) { this.kasa = kasa; }

    public Anakart getAnakart() { return anakart;}
    public void setAnakart(Anakart anakart) {this.anakart = anakart; }

    public Monitor getMonitor() { return monitor; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }
}