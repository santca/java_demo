/**
 * Created by chenyan on 2016/9/8.
 */
public class Test2 {
    public static void main(String[] args) {

        // byte,short,int ,char ,String(jdk1.7以上包含1.7)
        String var_param = "5";
        switch (var_param) {
            case "1":
                System.out.println("红楼梦");
                break;
            case "2":
                System.out.println("三国演绎");
                break;
            case "3":
                System.out.println("水浒传");
                break;
            case "4":
                System.out.println("西游记");
                break;
            default:
                System.out.println("金瓶梅");
                break;
        }
        System.out.println("********************************************");
    }
}
