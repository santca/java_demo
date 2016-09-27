import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by chenyan on 2016/9/27.
 */
public class Test6 {

    public static void main(String[] args) {

        String expression = "A(B(C))D";
        Pattern p = Pattern.compile(expression);
        Matcher m = p.matcher("ABCD");
        System.out.println("matches:" + m.matches());
        System.out.println("groupCount:" + m.groupCount());
        System.out.println("group():" + m.group());
        System.out.println("group(1):" + m.group(1));
        System.out.println("group(2):" + m.group(2));

    }
}
