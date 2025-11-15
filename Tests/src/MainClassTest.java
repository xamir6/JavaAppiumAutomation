import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    private int class_number = 20;

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("getLocalNumber() is not equals 14", 14, getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber() is less than 45", getClassNumber() > 45);
    }

    public int getLocalNumber() {
        return 14;
    }

    public int getClassNumber() {
        return class_number;
    }

}
