import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un text: ");
        String text = sc.nextLine();
        System.out.println("Numarul de coduri Unicod este: " + text.codePointCount(0,text.length()-1));
    }
}
