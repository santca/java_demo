/**
 * Created by chenyan on 16/9/12.
 */
public class Students {

    // 实例变量 ,成员变量
    String name;
    int age;
    int grade;
    String hobby;

    // 实例方法，成员方法
    public void show() {

        System.out.println("我的名字是"+name+",今年"+age+"岁,今年上"+grade+"年级,我的兴趣是"+hobby);

    }


    public static void main(String[] args){

        // 创建一个Students类的一个实体 也就是创建一个对象
        Students stu = new Students();

        stu.name="江户川.柯南";
        stu.age=7;
        stu.grade=1;
        stu.hobby="football";

        // 使用创建的对象，调用了这个对象的实例方法
        stu.show();

        stu.name="毛利兰";
        stu.age=17;
        stu.grade=11;
        stu.hobby="空手道";

        // 使用创建的对象，调用了这个对象的实例方法
        stu.show();

    }
}
