public class p13 {
    public static void main(String[] args) {
        String text1 = "This is exercise 3";
        String text2 = "This is exercise 3";
        int result = text1.compareTo(text2);
        if(result<0){
            System.out.println("Textul 1 e mai mic lexicografic ca textul 2");
        }else if(result==0){
            System.out.println("Textul 1 este egal cu textul 2");
        }else if(result>0){
            System.out.println("Textul 1 este mai mare ca textul 2");
        }
    }
}
