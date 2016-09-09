/**
 * Created by chenyan on 2016/9/9.
 */
public class Test9 {

    public static void main(String[] args){

        // 在银行存款 每年的利率为0.003，计算5年后，获得的本息

        double cunkuan=10000;
        double rate = 3;
        for(int i = 0;i < 5; i++) {

            cunkuan = cunkuan - (cunkuan * rate);
        }

        System.out.println(cunkuan);
    }
}
