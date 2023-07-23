import java.util.Scanner;

public class p8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu numarul de la tastatura:");
        int a = sc.nextInt();
        int contor = 0;
        while(a!=0){
            int c = a%10;
            if(c==1){
                contor++;
            }
            a=a/10;
        }
        System.out.println(" cifra 1 apare de : " + contor + " 15ori ");
    }
}
