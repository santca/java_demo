import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chenyan on 2016/9/27.
 */
public class Test7 {

    public static void main(String[] args) {

        String input = "I am a Java Programmer .I very like Java language , and I havingaaa a good book about Java called Thinking-in-Java";
     /*   Pattern p = Pattern.compile("\\bJava");
        Matcher m = p.matcher(input);
        input = m.replaceAll("sss");*/
        input = input.replaceAll("Java","C++");
        System.out.println(input);

    }
}
