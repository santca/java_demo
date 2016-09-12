/**
 * Created by chenyan on 16/9/12.
 */
public class Test2 {

    public static void main(String[] args) {

        int[][] array = new int[3][];

        System.out.println("赋值前");
        for (int i =0;i<array.length;i++) {

            System.out.println(array[i]);
        }

        for (int i =0;i<array.length;i++) {

            array[i] = new int[]{i+5,i+6,i+7};
        }

        System.out.println("赋值后");
        for (int i =0;i<array.length;i++) {
            for (int j =0;j<array[i].length;j++)
            System.out.println(array[i][j]);
        }

    }
}
