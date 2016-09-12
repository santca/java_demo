/**
 * Created by chenyan on 2016/9/12.
 */
public class Test14 {

    public static void main(String[] args) {

        int[] intArray = {1,5,8,4,6,2};

        int temp = 0;
        for(int i = 0;i<intArray.length;i++) {
            for(int j = i+1;j<intArray.length;j++) {
                if(intArray[i]>intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }

        for(int i =0;i<intArray.length;i++) {
            System.out.println(intArray[i]);
        }
    }
}
