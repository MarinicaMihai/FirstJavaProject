public class p18 {
    public static void main(String[] args) {
        int[] sir = new int[]{-3,10,11,12,55};
        int suma = 0;
        int l= sir.length;
        for(int i=0;i<l;i++){
            suma+=sir[i];
        }
        System.out.println("Media numerelor din sir este: " + suma/l);
    }
}
