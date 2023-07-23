public class p14 {
    public static void main(String[] args) {
        String text1 = "This is a boy";
        String text2 = "THIS IS a Boy";
        int result = text1.compareToIgnoreCase(text2);
        if(result==0){
            System.out.println("Cele 2 texte sunt egale lexicografic,ignorand scrierea cu majuscule");
        }else if(result<0){
            System.out.println("Primul text este mai mic lexicografic decat cel de-al 2-lea,ignorand scrierea cu majuscule");
        }else{
            System.out.println("Primul text este mai mare lexicografic decat cel de-al 2-lea,ignorand scrierea cu majuscule");
        }

    }
}
