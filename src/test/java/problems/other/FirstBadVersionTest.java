package problems.other;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion;

    @Before
    public void init() {
        firstBadVersion = new FirstBadVersion(0);
    }

    @Test
    public void firstBadVersion() {
        firstBadVersion.setBadVersion(1);
        assertEquals(1, firstBadVersion.firstBadVersion(22));
        firstBadVersion.setBadVersion(11);
        assertEquals(11, firstBadVersion.firstBadVersion(22));
        firstBadVersion.setBadVersion(2222);
        assertEquals(2222, firstBadVersion.firstBadVersion(9999));
        firstBadVersion.setBadVersion(1702766719);
        assertEquals(1702766719, firstBadVersion.firstBadVersion(2126753390));
    }
}