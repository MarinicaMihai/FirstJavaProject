import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu textu: ");
        String text = input.nextLine();
        System.out.println(text.toUpperCase());

    }
}
