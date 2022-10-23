import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        int n = this.getLocalNumber();
        if (n != 14) {
            Assert.fail("Its not true. We are waiting 14");
        } else {
            System.out.println("Yes");
        }

    }

    @Test
    public void testGetClassNumber(){
        int m = this.getClassNumber();
        if (m>45) {
            Assert.fail("Its not true." + m + "Is less then 45");
        }
        else {
            System.out.println("Success " + m +" is less then 45");

        }
    }
}
