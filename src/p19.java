public class p19 {
    public static void main(String[] args) {
        int[] array=new int[]{5,3,21,7,2,59};
        int min=array[0];
        int max=array[0];
        for(int i=0;i< array.length;i++){
                if(array[i]>max){
                    max=array[i];
                }
                if(array[i]<min){
                    min=array[i];
                }

        }
        System.out.println("Minimul sirului este: " +min);
        System.out.println("Maximul sirului este: " +max);
    }
}
