public class Array {
    public static void main(String[] args) {
        int[] intArray=new int[10];
        intArray[0]=2;
        intArray[1]=4;
        intArray[2]=6;
        int suma=0;
        for(int i=0;i<intArray.length;i++){
            suma=suma+intArray[i];
        }
        //System.out.println(suma);


        String[][] stringarray=new String[2][];
        stringarray[0]=new String[]{"Alice","has","the","cat" };
        stringarray[1]=new String[]{"The","cat","has","Alice"};
       // System.out.println(stringarray[1][3]);


        int[][] matrice=new int[5][5];
        int contor=0;
        for(int i=0;i< matrice.length;i++){
            for(int j=0;j<matrice[i].length;j++){
                matrice[i][j]=contor;
                contor++;
            }
        }
        for(int i=0;i<matrice.length;i++){
            for(int j=0;j< matrice[i].length;j++){
                if(j==4){
                    System.out.println(matrice[i][j]);
                }else{
                    System.out.print(matrice[i][j] + "        ");
                }

            }
        }

    }
}
