import java.util.Scanner;

/**
 * Created by chenyan on 2016/9/9.
 */
public class Test8 {

    public static void main(String[] args) {

        int i = 0;
        while ( i < 5) {

            System.out.println("输入错误，请重新输入");
            i = new Scanner(System.in).nextInt();

            if (i <5&& i>0) {
                System.out.println("输入正确");
                i= 100;
            }
            else {
                i = 0;
            }
        }
    }
}
