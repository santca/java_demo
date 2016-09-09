/**
 * Created by chenyan on 2016/9/9.
 */
public class Test11 {

    public static void main(String[] args) {

        int num1=0;
        int num2=0;


        aa: for (int j =0;j<5;j++) {

            for (int index =0;index< 6;index++) {

                if (index ==3) {
                    break aa;
                }
                num1 ++;
            }
        }

        System.out.println("num1="+num1);
        System.out.println("num2="+num2);
    }
}
