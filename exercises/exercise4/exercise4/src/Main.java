
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[] subjectStrings = {
                "hello",
                "hello world",
                "hello_world",
                "12345_6789",
                "123",
                "11-11-1111",
                "11:11:11"
        };

        String[] regexPatterns = {
                "^\\w+$",
                "^\\w+_\\w+$",
                "^\\d+_\\d+$",
                "^\\d{3}$",
                "^\\d{2}-\\d{2}-\\d{4}$",
                "^\\d{2}:\\d{2}:\\d{2}$"
        };


        for (String subject : subjectStrings) {
            System.out.println("Subject String: " + subject);
            for (String regex : regexPatterns) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(subject);
                if (matcher.find()) {
                    System.out.println("Pattern \"" + regex + "\" matches.");
                } else {
                    System.out.println("Pattern \"" + regex + "\" does not match.");
                }
            }
            System.out.println("test completed");
        }
    }
}

