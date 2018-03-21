package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppleStocksTest {

    @Test
    public void getMaxProfit() {
        assertEquals(10, AppleStocks.getMaxProfit(new int[]{4,5,6,0,4,2,10,9,8}));
        assertEquals(6, AppleStocks.getMaxProfit(new int[]{10, 7, 5, 8, 11, 9}));
        assertEquals(0, AppleStocks.getMaxProfit(new int[]{10}));
        assertEquals(0, AppleStocks.getMaxProfit(new int[]{10, 5}));
    }
}