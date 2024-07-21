import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch {
    public static void main(String[] args) {
        String text = "the teacher wore a yellow turtleneck";

        // Search for "nec"
        Pattern pattern1 = Pattern.compile("nec");
        Matcher matcher1 = pattern1.matcher(text);

        if (matcher1.find()) {
            System.out.println("Found 'nec' at: " + matcher1.start() + " to " + matcher1.end());
        } else {
            System.out.println("'nec' not found");
        }

        // Search for "NEC"
        Pattern pattern2 = Pattern.compile("NEC");
        Matcher matcher2 = pattern2.matcher(text);

        if (matcher2.find()) {
            System.out.println("Found 'NEC' at: " + matcher2.start() + " to " + matcher2.end());
        } else {
            System.out.println("'NEC' not found");
        }
    }
}
