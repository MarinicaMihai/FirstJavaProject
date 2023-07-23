import java.util.Scanner;

public class p9 {

    public static void main(String[] args) {
//concatenarea a 2 stringuri
       String text1 = "Cel mai bun jucator de fotbal este: ";
       String text2 = "Leo Messi ";
       String text3 = text1+text2;
        //System.out.println(text3);

        //Determinarea lungimii unui String

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Introduceti textul: ");
        //String text4 = sc.nextLine();
        //System.out.println("Lungimea textului introdus este: " + text4.length());
        //System.out.println(text4.contains("B"));


        //replace

        String text5="Primul text a fost scris";
        String text6=(text5.replace("t","r"));
        System.out.println(text6);
    }
}
