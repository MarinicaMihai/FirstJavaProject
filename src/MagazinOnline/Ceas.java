package MagazinOnline;

public class Ceas {
    protected String brand;
    protected String mecanism;
    protected String culoare;
    protected double pret;
    protected String stil;
    protected String gen;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMecanism() {
        return mecanism;
    }

    public void setMecanism(String mecanism) {
        this.mecanism = mecanism;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getStil() {
        return stil;
    }

    public void setStil(String stil) {
        this.stil = stil;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public Ceas(String brand, String mecanism, String culoare, double pret, String stil, String gen) {
        this.brand = brand;
        this.mecanism = mecanism;
        this.culoare = culoare;
        this.pret = pret;
        this.stil = stil;
        this.gen = gen;
    }
    protected double durataDeViata(){
        if("mecanic".equals(mecanism)){
            return 10;
        }else if("electronic".equals(mecanism)){
            return 2;
        }else{
            return 0.1;
        }
    }
}


