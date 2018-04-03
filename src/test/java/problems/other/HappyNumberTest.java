package problems.other;

import org.junit.Test;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class HappyNumberTest {

    @Test
    public void isHappy() {
        assertTrue(HappyNumber.isHappy(19));
        assertTrue(HappyNumber.isHappy(1));
        assertTrue(HappyNumber.isHappy(7));
        assertTrue(HappyNumber.isHappy(23));
        assertFalse(HappyNumber.isHappy(22));
        assertFalse(HappyNumber.isHappy(9));
        assertFalse(HappyNumber.isHappy(12));
        assertFalse(HappyNumber.isHappy(2));
    }
}