/**
 * Created by chenyan on 2016/10/9.
 */
public class Outer {

    private String gender = "男";

    // 静态内部类
    public class Inner {

        public String showAge(String age) {
            String ss = "今年"+age+"，我的性别是"+gender;
            System.out.println(ss);
            return ss;
        }
    }

    private Inner inner = new Inner();

    public void show(int age) {

        String str = inner.showAge(String.valueOf(age));

        System.out.println("str="+str);
    }

    public static void main(String[] args) {
        // Outer os = new Outer();
        //os.show(21);
        Outer.Inner inner = new Outer().new Inner();
        inner.showAge("35");
    }
}
