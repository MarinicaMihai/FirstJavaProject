public class p20 {
    public static void main(String[] args) {
        int[] array1=new int[]{1,2,3,4,5};
        int[] array2=new int[array1.length];
        for(int i=0;i< array1.length;i++){
            array2[i]=array1[array1.length-1-i];
        }
        for(int j = 0; j< array2.length; j++){
            System.out.println(array2[j]);
        }

    }
}
