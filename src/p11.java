import java.util.Scanner;

public class p11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introdu textul: ");
        String text=sc.nextLine();
        System.out.println("Introdu pozitia: ");
        int pozitie=sc.nextInt();
        System.out.println("Codul pentru caracterul " + text.charAt(pozitie)+ " este " +text.codePointAt(pozitie));
    }
}
