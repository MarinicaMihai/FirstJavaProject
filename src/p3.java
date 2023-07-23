import java.util.Scanner;

public class p3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Introdu numarul binar: ");
        long numarBinar = input.nextLong();
        long j = 1;
        long reminder;
        long numarZecimal=0;
        while(numarBinar!=0){
            reminder= numarBinar%10;
            numarZecimal= numarBinar + reminder * j;
            j=j*2;
            numarBinar=numarBinar/10;
        }
        System.out.println("Numarul in zecimal este: " + numarZecimal);
    }
}
