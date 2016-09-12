/**
 * Created by chenyan on 16/9/12.
 */
public class Student {

    String name;
    int age;
    String className;
    String hobby;

    void show() {

        String str="aa";

        System.out.println("我叫"+name+",今年"+age+",我在"+className+"，我的兴趣是"+hobby+str);
    }

    String show1() {

        //System.out.println(str);

        return ";";
    }
}
