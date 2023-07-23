package Varargs;

public class MainVarArgs {
    public static void main(String[] args) {
        TestVarargs.print(2,3,4,1,5,6,3,2,42);
        int[] v1=new int[]{10,15,16};
        int[] v2=new int[]{14,18,20};

        int[] v=TestVarargs.alipire2Vectori(v1,v2);
        for(int i=0;i< v.length;i++){
            System.out.println("Pe pozitia " + (i+1) + " in vectorul suma avem: " + v[i]);
        }
    }
}
