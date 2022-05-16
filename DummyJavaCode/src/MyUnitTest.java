import org.junit.Test;
import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testSum() {
        MyUnit myUnit = new MyUnit();

        int result = myUnit.sum_and_divide_by_4(10, 30);

        assertEquals(10, result);

    }
}
