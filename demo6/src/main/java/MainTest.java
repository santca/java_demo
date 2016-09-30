import java.io.File;
import java.io.IOException;

/**
 * Created by chenyan on 2016/9/30.
 */
public class MainTest {

    public static void main(String[] args) {

        File file  = new File("config.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
