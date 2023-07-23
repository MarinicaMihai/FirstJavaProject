package Exercitii;

public class MainFruct {
    public static void main(String[] args) {
        Fruct f1=new Fruct("verde",200,true);
        Fruct f2=new Fruct("rosu",100,false);
        Fruct f3=new Fruct("verde",75,true);
        Fruct f4=new Fruct("galben",80,true);
        Fruct[] listaFructe=new Fruct[]{f1,f2,f3,f4};
        operatiiFructe fructe=new operatiiFructe();
        fructe.fructe=listaFructe;
        //fructe.filtrareDupaCuloare();
        //fructe.filtrareDupaGreutate();
        fructe.filtrareGreutateSiSeminte();
    }
}
