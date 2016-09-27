import java.util.Scanner;

/**
 * Created by chenyan on 16/9/13.
 */
public class SignPrint {

    /*

    &
    &&
    &&&
    &&&&
    &&&&&

     */

    /**
     *
     * 产生paramLineNum行，sign符号构成的直角三角形图形
     *
     * @param paramLineNum  需要显示行数
     * @param sign 构造图形的符号
     */
    public void printSign(int paramLineNum, String sign){

        for (int lineIndex = 1; lineIndex< paramLineNum;lineIndex ++) {


            for (int signIndex = 1; signIndex <= lineIndex;signIndex ++) {
                System.out.print(sign);
            }

            System.out.println();

        }
    }

    public static void main(String[] args){

        System.out.print("请输入需要显示的行数:");
        Scanner scanner = new Scanner(System.in);

        // 获取你输入的行数
        int lineNum = scanner.nextInt();

        System.out.print("请输入构成图形的符号:");

        // 获取你输入的符号
        String sign = scanner.next();

        // 创建一个SignPrint对象
        SignPrint sp = new SignPrint();

        // 调用对象的printSign方法，把需要生成的行数和符号当做实际参数传入
        sp.printSign(lineNum,sign);
    }
}
