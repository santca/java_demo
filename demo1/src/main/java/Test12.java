/**
 * Created by chenyan on 2016/9/9.
 */
public class Test12 {

    public static void main(String[] args){

        /*
        1~10之间的整数相加，得到的累加值大于20后结束循环，且输出此累加值
        */

        // 记录每个数相加的结果
        int sum = 0;
        for(int index = 1; index< 11;index ++) {
            sum = sum + index;

            if (sum > 20) {
                break;
            }
        }

        System.out.println(sum);
    }
}
