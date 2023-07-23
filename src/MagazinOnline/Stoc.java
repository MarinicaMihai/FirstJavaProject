package MagazinOnline;

import java.util.Arrays;

public class Stoc {
    protected Ceas[] magazin;

    public Ceas[] getMagazin() {
        return magazin;
    }

    public void setMagazin(Ceas[] magazin) {
        this.magazin = magazin;
    }

    public Stoc(Ceas[] magazin) {
        this.magazin = magazin;
    }

    protected void filtrareMecanism(String mecanism) {

        for (int i = 0; i < magazin.length; i++) {
           if(magazin[i].mecanism.equals(mecanism)){
               System.out.println(magazin[i].brand);
           }
        }

    }
    protected void listaCeasuriCuDurataDeViataMaiMareCa(double durataDeViata){
        int l= this.magazin.length;
        for(int i=0;i<l;i++){
            if(magazin[i].durataDeViata()>durataDeViata){
                System.out.format("Ceasul cu durata de viata mai mare ca %f este: %s%n",durataDeViata,magazin[i].getBrand());
            }
        }
    }

    protected void coordonareCeasuri(String coordonare){
        int l=this.magazin.length;
        bubbleSort();
        if("crescator".equals(coordonare)){
            for(int i=0;i<l;i++){
                System.out.println(magazin[i].getBrand());
            }
        }else if("descrescator".equals(coordonare)){
            for(int i=l-1;i>=0;i--){
                System.out.println(magazin[i].getBrand());
            }
        }
    }
    protected Ceas[] bubbleSort(){
        int l= magazin.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<(l-i-1);j++){
                if(magazin[j].pret>magazin[j+1].pret){
                    Ceas temp=magazin[j];
                    magazin[j]=magazin[j+1];
                    magazin[j+1]=temp;
                }
            }
        }
        return magazin;
    }

    protected void profitabilitateaCeasuri(double[] costuriProductie){
        int l = magazin.length;
        for(int i=0;i<l;i++){
            //magazin 100%
            //x=cost%
            double x=magazin[i].getPret()-costuriProductie[i];
            double profitabilitate=(x/costuriProductie[i])*100;
            System.out.println("Profitabilitaeta pentru ceasul: " + magazin[i].brand + " este: " + profitabilitate + "%");
        }
    }

}
