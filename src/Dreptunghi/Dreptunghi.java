package Dreptunghi;

public class Dreptunghi {
    private double lungime;
    private double latime;

    public Dreptunghi(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }


    public double calculeazaAria() {
        return latime * lungime;
    }

    public double calculeazaPerimetrul() {
        return 2 * latime + 2 * lungime;
    }

    public boolean verificaPatrat(){
        if(lungime==latime){
            return true;
        }else{
            return false;
        }
    }
}
