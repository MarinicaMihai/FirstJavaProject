package Varargs;

public class TestVarargs {
    public static void print(int...numere){
        for(int i=0;i< numere.length;i++){
            System.out.println(numere[i]);
        }
    }
    public static int[] alipire2Vectori(int[] v1,int[] v2){
        int l= v1.length;
        int indice=0;
        int[] v=new int[2*l];
        for(int i=0;i<l;i++){
            v[indice]=v1[i];
            v[++indice]=v2[i];
            indice++;
        }
        return v;
    }
}
