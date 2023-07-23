import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p16 {
    public static void main(String[] args) {
        String regexString = "bogdan@gmail.com";
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern= Pattern.compile(regex);
        Matcher macher=pattern.matcher(regexString);
        if(macher.matches()){
            System.out.println(regexString + " este un email valid ");
        }else{
            System.out.println(regexString + " nu este un email valid ");
        }
    }
}
