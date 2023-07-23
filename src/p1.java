import java.util.Scanner;

public class p1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu primul numar: ");
        double a = input.nextDouble();
        System.out.println("Introdu al doilea numar : ");
        double b = input.nextDouble();
        System.out.println("Introdu operatia: ");
        String operatie = input.next();
        switch(operatie){
            case "adunare":
                System.out.println("Suma numerelor este: " + (a + b));
                break;
            case "scadere":
                System.out.println("Diferenta numerelor este: " + (a-b));
                break;
            case "inmultire":
                System.out.println("Produsul numerelor este: " +(a*b));
                break;
            case "impartire":
                System.out.println("Rezultatul impartirii este: " +(a/b));
                break;
            default:
                System.out.println("Operatia nu a fost recunoscuta.");
                break;
        }

    }

}
