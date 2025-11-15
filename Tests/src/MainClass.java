import org.junit.Assert;
import org.junit.Test;

public class MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("getLocalNumber() is not equals 14", 14, getLocalNumber());
    }

    public int getLocalNumber() {
        return 14;
    }

}
