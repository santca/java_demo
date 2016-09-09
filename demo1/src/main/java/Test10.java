import java.util.Scanner;

/**
 * Created by chenyan on 2016/9/9.
 */
public class Test10 {

    public static void main(String[] args) {

        /*
        商场对n个顾客的年龄层次(30以上(包含30)和30以下)进行调查
        计算各层次的顾客比例  30以上的人数/总统计人数，   1-30以上的人数/总统计人数
        */


        //统计30以上(包含30)的顾客个数
        double input_customer_count_1=0;

        //30以下的顾客个数
        double input_customer_count_2=0;



        int index = 0;

        while (true) {
            index ++;
            System.out.println("请输入第"+index+"个顾客的年龄:");

            // 输入的顾客年龄
            int input_customer_age = new Scanner(System.in).nextInt();

            if (input_customer_age >=30 ) {
                input_customer_count_1 ++;
            }
            else if ((input_customer_age) <30 && (input_customer_age > 0)) {
                input_customer_count_2++;
            }
            else {
                break;
            }
        }

        System.out.println("录入完毕。。。。");

        double  rate1 = input_customer_count_1/(input_customer_count_1+input_customer_count_2);
        double rate2 = 1-rate1;

        System.out.println("在参与统计的"+(input_customer_count_1+input_customer_count_2)+"顾客中");
        System.out.println("30岁以上所占比率为:"+(rate1*100)+"%");
        System.out.println("30岁以下所占比率为:"+(rate2*100)+"%");
    }
}
