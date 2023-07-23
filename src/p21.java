import java.util.Arrays;

public class p21 {
    public static void main(String[] args) {
        //find duplicate

        int[] duplicateArray=new int[]{20,20,30,40,50,50};
        int lungimeaFaraDuplicate=1;
        Arrays.sort(duplicateArray);
        for(int i=0;i<duplicateArray.length-1;i++){
            if(duplicateArray[i]!=duplicateArray[i+1]){
                lungimeaFaraDuplicate++;
            }

        }
        System.out.println(lungimeaFaraDuplicate);
    }
}
