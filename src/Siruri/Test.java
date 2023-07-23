package Siruri;

public class Test {
    public static boolean compar2Siruri(int[] sir1, int[] sir2) {
        int l1 = sir1.length;
        int l2 = sir2.length;
        boolean siruriEgale = true;
        if (l1 == l2) {
            int i = 0;
            do {
                if (sir1[i] == sir2[i]) {
                    i++;
                } else {
                    siruriEgale = false;
                }
            } while (siruriEgale == true && i < l1 - 1);
        } else {
            System.out.println("Eroare: cele 2 siruri nu au lungimi egale");
        }
        siruriEgale = false;
        return siruriEgale;
    }
}


