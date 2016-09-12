import sun.nio.ch.sctp.SctpNet;

import java.util.Scanner;

/**
 * Created by chenyan on 16/9/12.
 */
public class Test3 {

    // 写一个方法，计算传入的两个整数的和，并把结果进行返回
    int add(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数");
        int inputNum1 = scanner.nextInt();
        System.out.print("请输入第二个整数");
        int inputNum3 = scanner.nextInt();

        Test3 t3 = new Test3();

        System.out.println(t3.add(33,44));

    }
}
