import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    public MainClassTest() {
    }

    @Test
    public void testGetLocalNumber() {
        int n = this.getLocalNumber();
        if (n != 14) {
            Assert.fail("Its not true. We are waiting 14");
        } else {
            System.out.println("Yes");
        }

    }
}
