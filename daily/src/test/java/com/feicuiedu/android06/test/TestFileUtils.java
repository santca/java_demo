package com.feicuiedu.android06.test;

import com.feicuiedu.daily.uitl.FileUtils;
import org.junit.Test;

/**
 * Created by chenyan on 2016/10/10.
 */
public class TestFileUtils {

    @Test
    public void testReadFile() {
        String path = "E:\\git_project\\feicui\\jinan\\java_demo\\daily\\src\\main\\resources";
        String name = "welcome.txt";
        //String str = this.getClass().getResource("/").toString();
        String str = FileUtils.readFile(path,name);
        System.out.println(str);
    }
}
