import java.util.Scanner;

/**
 * Created by zuoyifeng on 2016/9/8.
 */
public class Test5 {

    public static void main(String[] ager) {
        System.out.println("请输入消费金额");
        Scanner Num = new Scanner(System.in);
        int Money = Num.nextInt();
       /* System.out.println("请选择是否参加换购活动:1.参见   2.不参加");
        Scanner Num2 = new Scanner(System.in);
        int judge = Num2.nextInt();
        while(judge == 1) */
        switch (Money / 50) {
            case 0:
                System.out.println("不换购");
                break;
            case 1:
                System.out.println("是否参加优惠换购活动?");
                System.out.println("1:满50元,加2元得百事可乐");
                System.out.println("0:不换购");
                break;
            case 2:
                System.out.println("是否参加优惠换购活动?");
                System.out.println("1:满50元,加2元得百事可乐");
                System.out.println("2:满100元,加3元得500ml可乐");
                System.out.println("3:满100元,加10元得5Kg面粉");
                System.out.println("0:不换购");
                break;
            case 3:
                System.out.println("是否参加优惠换购活动?");
                System.out.println("1:满50元,加2元得百事可乐");
                System.out.println("2:满100元,加3元得500ml可乐");
                System.out.println("3:满100元,加10元得5Kg面粉");
                System.out.println("0:不换购");
                break;
            default:
                System.out.println("是否参加优惠换购活动?");
                System.out.println("1:满50元,加2元得百事可乐");
                System.out.println("2:满100元,加3元得500ml可乐");
                System.out.println("3:满100元,加10元得5Kg面粉");
                System.out.println("4:满200元,加10元得炒锅");
                System.out.println("5:满200元,加10元得爽肤水");
                System.out.println("0:不换购");
                break;
        }
        if (Money / 50 != 0) {
            Scanner Num3 = new Scanner(System.in);
            int C = Num3.nextInt();
            switch (C) {
                case 0:
                    System.out.println("不换购");
                    System.out.println("本次消费总金额:" + Money);
                    break;
                case 1:
                    System.out.println("得百事可乐");
                    Money = Money + 2;
                    System.out.println("本次消费总金额:" + Money);
                    break;
                case 2:

                    System.out.println("得500ml可乐");
                    Money = Money + 3;
                    System.out.println("本次消费总金额:" + Money);
                    break;
                case 3:

                    System.out.println("10元得5Kg面粉");
                    Money = Money + 10;
                    System.out.println("本次消费总金额:" + Money);
                    break;
                case 4:

                    System.out.println("10元得炒锅");
                    Money = Money + 10;
                    System.out.println("本次消费总金额:" + Money);
                    break;
                case 5:

                    System.out.println("10元得爽肤水");
                    Money = Money + 10;
                    System.out.println("本次消费总金额:" + Money);
                    break;
                default:
                    System.out.println("0:不换购");
            }
        } else {
            System.out.println("退出");
        }


    }

}
