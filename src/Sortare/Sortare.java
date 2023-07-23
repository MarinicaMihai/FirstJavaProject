package Sortare;

public class Sortare {
    public static void main(String[] args) {
        int[] v1=new int[]{12,34,2,23,43,4,3,54,23};
        for(int i=0;i< v1.length;i++){
            for(int j=0;j< v1.length-1;j++){
                if(v1[j]>v1[j+1]){
                    int temp=v1[j];
                    v1[j]=v1[j+1];
                    v1[j+1]=temp;
                }
            }
        }
        for(int i=0;i< v1.length;i++){
            System.out.println(v1[i]);
        }
    }
}
