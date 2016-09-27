import java.util.Scanner;

/**
 * Created by chenyan on 16/9/13.
 */
public class Student1 {

    public double avgHeight(double sumHeight, int count) {


        return sumHeight/count;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        while (true){
            System.out.print("请输入第"+(count+1)+"个学生身高");
            double currentHeight = scanner.nextDouble();
            sum = sum + currentHeight;
            count ++;

            System.out.print("是否继续输入 y:继续 n:退出");
            String isContinue = scanner.next();
            if ("y".equals(isContinue)) {
                continue;
            }
            else {
                break;
            }

        }

        Student1 stu1 = new Student1();
        double avgheight = stu1.avgHeight(sum,count);
        System.out.println("这"+count+"个学生的平均身高是"+avgheight+"cm");

    }
}
