import java.util.Scanner;

/**
 * Created by chenyan on 2016/9/8.
 */
public class Test3 {

    public static void main(String[] args) {

        /*
        从键盘输入您所购买商品的价格和是否为会员以及会员积分
        非会员, 9.5折
        会员将根据积分的不同享受不同的折扣，输出会员应该获得的折扣
        会员将根据积分的不同享受不同的折扣，输出商品打折后的价格

        会员积分x            折  扣
        x ＜ 2000              9折
        2000 ≤ x ＜ 4000      8折
        4000 ≤ x ＜ 8000      7折
        x ≥ 8000              6折
        */

        Scanner scanner = new Scanner(System.in);

        //输入参数  0:非会员 1：会员
        System.out.print("请选择是否为会员 0:非会员 1：会员 ");
        int is_member = scanner.nextInt();

        System.out.print("请输入消费的价格: ");
        double price = scanner.nextDouble();


        // 输出结构
        // 折扣
        double discount = 0;
        // 折扣价格
        double final_price = 0;

        // 选择非会员的时候

        switch (is_member){
            case 0:

                discount = 0.95;
                break;
            case 1:
                System.out.print("请输入所具有积分: ");
                int integral = scanner.nextInt();

                int result = integral/2000;

                switch (result) {
                    case 0:
                        discount = 0.9;
                        break;
                    case 1:
                        discount = 0.8;
                        break;
                    case 2:
                        discount = 0.7;
                        break;
                    case 3:
                        discount = 0.7;
                        break;
                    default:
                        discount = 0.6;
                        break;
                }
                /*
                if (integral < 2000) {
                    discount = 0.9;
                } else if (integral >= 2000 && integral < 4000) {
                    discount = 0.8;
                } else if (integral >= 4000 && integral < 8000) {
                    discount = 0.7;
                } else {
                    discount = 0.6;
                }*/
                break;
            default:
                System.out.println("您选择错误");
                break;
        }

        final_price = price * discount;

        System.out.println("最终的折扣为" + discount + "折,打折的价格为" + final_price);

    }
}
