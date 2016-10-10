import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenyan on 2016/10/9.
 */
public class Test1 {

    public static void main(String[] args) {

        //String[] strs = new String[1];
        //
        List list = new ArrayList();

        list.add(1);
        list.add("2");
        list.add(3l);
        list.add(4f);
        list.add(new MainTest());

        test(list);
    }

    public static void test(List list) {
        for (int i = 0; i < list.size() ; i++) {
            String s = (String) list.get(i);
            System.out.println(s);
        }
    }
}
