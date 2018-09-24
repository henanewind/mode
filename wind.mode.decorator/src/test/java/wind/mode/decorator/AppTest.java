package wind.mode.decorator;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Rule
    public final SystemOutRule outRule = new SystemOutRule().enableLog();
    //错误输出
    @Rule
    public final SystemErrRule errRule=new SystemErrRule();
    /**
     * Rigorous Test :-)
     */
    @Test
    public void toLowerTest()
    {
        App.toLower();
        assertEquals("i konw the decorator pattern therefore i rule!",
                outRule.getLog());
    }
}
