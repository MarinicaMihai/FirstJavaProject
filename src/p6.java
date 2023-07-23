import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {
        double raza;
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu raza cercului: ");
        raza = input.nextInt();
        double perimetru =2 * Math.PI * raza;
        double aria = Math.PI * raza * raza;
        System.out.println("Perimetrul cercului este: " +perimetru);
        System.out.println("Aria cercului este: " +aria);
    }
}
