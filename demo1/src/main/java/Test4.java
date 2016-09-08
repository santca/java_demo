import java.util.Scanner;

/**
 * Created by chenyan on 2016/9/8.
 */
public class Test4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 用户输入的消费金额
        System.out.print("请输入消费金额:");
        double input_price = scanner.nextDouble();

        // 用户选的活动类型
        System.out.println("请选择换购活动:");
        System.out.println("0:不换购							");
        System.out.println("1:满50 加2元换购可乐                ");
        System.out.println("2:满100 加3元换购500ml可乐          ");
        System.out.println("3:满100 加10元换购5斤面粉           ");
        System.out.println("4:满200 加10元换购苏泊尔炒锅        ");
        System.out.println("5:满200 加20元换购欧莱雅爽肤水      ");
        int selected_item = scanner.nextInt();

        // 根据输入的消费金额 与用户所选的活动金额，计算出的最终消费金额
        double output_price = 0;

        String output_message = "";
        /*
        0:不换购
        1:满50 加2元换购可乐
        2:满100 加3元换购500ml可乐
        3:满100 加10元换购5斤面粉
        4:满200 加10元换购苏泊尔炒锅
        5:满200 加20元换购欧莱雅爽肤水
         */

        switch (selected_item) {

            case 0:
                output_price = input_price;
                break;
            case 1:
                if (input_price >= 50) {
                    output_price = input_price + 2;
                    output_message = "换购可乐";
                } else {
                    output_price = input_price;
                    output_message = "不具备参与活动资格";
                }
                break;
            case 2:
                if (input_price >= 100) {
                    output_price = input_price + 3;
                    output_message = "换购500ml可乐";
                } else {
                    output_price = input_price;
                    output_message = "不具备参与活动资格";
                }
                break;
            case 3:
                if (input_price >= 100) {
                    output_price = input_price + 10;
                    output_message = "换购5斤面粉";
                } else {
                    output_price = input_price;
                    output_message = "不具备参与活动资格";
                }
                break;
            case 4:
                if (input_price >= 200) {
                    output_price = input_price + 10;
                    output_message = "换购苏泊尔炒锅";
                } else {
                    output_price = input_price;
                    output_message = "不具备参与活动资格";
                }
                break;
            case 5:
                if (input_price >= 200) {
                    output_price = input_price + 20;
                    output_message = "换购欧莱雅爽肤水";
                } else {
                    output_price = input_price;
                    output_message = "不具备参与活动资格";
                }
                break;
        }

        System.out.println("本次消费综合为:"+output_price);
        System.out.println(output_message);
    }
}
