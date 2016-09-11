import java.util.Scanner;

/**
 * Created by chenyan on 2016/9/11.
 */
public class Test13 {

    public static void main(String[] args) {

        System.out.print("请输入一个数字:");
        int input_number = new Scanner(System.in).nextInt();

        // 用来存储商
        int number_times = 0;

        // 用来记录位数
        int index=0;
        while(true) {
            index ++;
            number_times = input_number/10;
            if (number_times==0) {
                break;
            }
            input_number = number_times;
        }

        System.out.println("这是一个"+index+"位数");
    }
}
