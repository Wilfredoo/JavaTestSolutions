import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTest {

    public static boolean isMatch(String input) {
        String regex = "^(damage|minor damages|heavy damage)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isMatch("damage"));         
        System.out.println(isMatch("minor damages"));   
        System.out.println(isMatch("heavy damage"));   
        System.out.println(isMatch("no damages"));     
    }
}
