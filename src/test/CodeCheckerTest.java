package test;

import com.laboratory.CodeChecker;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CodeCheckerTest {
    private CodeChecker codeChecker;
    private String mInputString;
    private boolean mTestResult;

    @Parameterized.Parameters
    public static Collection<Object []> data() {
        Object[][] data = new Object[][] {
                { "#FF0000", true },
                { "#c0c0c0", true },
                { "#000000", true },
                { "#eeeeee", true },
                { "#g1g2g3", false },
                { "#zzzzzz", false },
                { "eee", false },
                { "ff00", false }};
        return Arrays.asList(data);
    }

    public CodeCheckerTest(String inputString, boolean testResult){
        this.mInputString = inputString;
        this.mTestResult = testResult;
    }

    @Before
    public void initTest() {
        codeChecker = new CodeChecker();
    }

    @Test
    public void testCheckThisCode() {
        boolean mValue = codeChecker.checkThisCode(mInputString);
        assertEquals(mTestResult, mValue);
    }
}
