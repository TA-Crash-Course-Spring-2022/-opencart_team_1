import driver.Driver;
import navigation.Navigation;
import org.testng.annotations.Test;


public class SimpleTest extends BaseTest{
    @Test
    public void TryTest() {
        Driver.waitForcibly();
    }
}
