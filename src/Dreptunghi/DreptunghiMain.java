package Dreptunghi;

public class DreptunghiMain {
    public static void main(String[] args) {
        Dreptunghi dreptunghi=new Dreptunghi(10,5);
        dreptunghi.setLatime(10);
        double perimetru=dreptunghi.calculeazaPerimetrul();
        double aria= dreptunghi.calculeazaAria();
        System.out.println("Perimetrul dreptunghiului este: "+perimetru);
        System.out.println("Aria dreptunghiului este: "+aria);
        System.out.println("Este dreptunghiul patrat? " + dreptunghi.verificaPatrat());
        }
    }

