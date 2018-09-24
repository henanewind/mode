package wind.mode.tools;

import java.net.URL;

/**
 * 常用工具集
 */
public class ToolUtils {
    /**
     * 获取运行时路径
     * @return 应用运行的目录  如  X:/app/
     */
    public static String getRootPath() {
        URL classPath = Thread.currentThread().getContextClassLoader().getResource("");
        String proFilePath = classPath.toString();
        //移除开通的file:/六个字符
        proFilePath = proFilePath.substring(6);
        return proFilePath;
    }
}
