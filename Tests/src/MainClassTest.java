import org.junit.Assert;
import org.junit.Test;

public class MainClassTest {

    MainClass mainClass = new MainClass();

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("getLocalNumber() is not equals 14",
                14, mainClass.getLocalNumber());
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("getClassNumber() is less than 45",
                mainClass.getClassNumber() > 45);
    }

    @Test
    public void testGetClassString() {
        Assert.assertTrue(
                mainClass.getClassString().contains("hello") || mainClass.getClassString().contains("Hello"));

    }

}
