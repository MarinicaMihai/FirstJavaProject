package MagazinOnline;

public class Main {
    public static void main(String[] args) {
        Ceas rolex = new Ceas("rolex","mecanic","negru",5000,"bussines","barbati");
        Ceas fossil = new Ceas("fossil","mecanic","maro",2000,"bussines","barbati");
        Ceas huawey = new Ceas("huawey","smart","gri",3500,"casual","femei");
        Ceas gShock = new Ceas("g-Shock","electronic","roz",1500,"sport","barbar");
        Ceas[] magazin=new Ceas[]{rolex,fossil,huawey,gShock};

        Stoc ceasuri=new Stoc(magazin);
        //ceasuri.filtrareMecanism("smart");
        //ceasuri.listaCeasuriCuDurataDeViataMaiMareCa(0.3);
        ceasuri.coordonareCeasuri("crescator");
        double[] costuriProductie=new double[]{2500,500,230,100};
        ceasuri.profitabilitateaCeasuri(costuriProductie);




    }
}
