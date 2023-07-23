package Exercitii;

import java.util.Scanner;

public class operatiiFructe {
    public Fruct[] fructe;
    public void filtrareDupaCuloare(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu culoarea: ");
        String culoare=sc.nextLine();
        for(int i=0;i< fructe.length;i++){
            if(fructe[i].getCuloare().equals(culoare)){
                System.out.println(fructe[i].getGreutate() + " " + fructe[i].getCuloare());
            }
        }
    }

    public void filtrareDupaGreutate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu greutatea: ");
        double greutate=sc.nextDouble();
        for(int i=0;i< fructe.length;i++){
            if(fructe[i].getGreutate()>greutate){
                System.out.println(fructe[i].getGreutate() + " " +fructe[i].getCuloare());
            }
        }
    }

    public void filtrareGreutateSiSeminte(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu greutatea: ");
        double greutate=sc.nextDouble();
        for(int i=0;i< fructe.length;i++){
            if(fructe[i].getGreutate()<greutate && fructe[i].isSeminte()==true){
                System.out.println(fructe[i].getGreutate() + " " +fructe[i].getCuloare() + " " + fructe[i].isSeminte());
            }
        }
    }
}
