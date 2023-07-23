import java.util.Scanner;

public class p5 {
    public static void main(String[] args)
    {
        int n1;
        int n2;
        Scanner inputNew = new Scanner(System.in);
        System.out.println(" Introdu primul numar: ");
        n1= inputNew.nextInt();
        System.out.println(" Introdu al 2-lea numar: ");
        n2= inputNew.nextInt();
        if(n1<n2){
            System.out.println(" Primul numar " +n1 + " este mai mic decat " +n2);

        }else if(n1==n2){
            System.out.println(" Numarul " + n1 + " este egal cu numarul " + n2);

        }else{
            System.out.println(" Primul numar este " +n1 + " este mai mare ca numarul " +n2);

        }


    }

    }

