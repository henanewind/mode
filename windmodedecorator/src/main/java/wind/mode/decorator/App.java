package wind.mode.decorator;

import wind.mode.tools.ToolUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 转为小写测试!
 */
public class App {
    public static void main(String[] args) {
        toLower();
    }

    public static void toLower() {
        int c;
        try {
            String name = String.format("%s%s", ToolUtils.getRootPath(), "test.txt");
//            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(new File(name))));
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(name)));

            while ((c = in.read()) >= 0) {
                // i konw the decorator pattern therefore i rule!
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
