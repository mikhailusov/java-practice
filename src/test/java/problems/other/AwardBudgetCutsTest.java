package problems.other;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AwardBudgetCutsTest {

    @Test
    public void findGrantsCap() {
        assertEquals(47, AwardBudgetCuts.findGrantsCap(new double[]{2, 100, 50, 120, 1000}, 190), 0);
        assertEquals(47, AwardBudgetCuts.findGrantsCap(new double[]{1000, 2, 100, 50, 120}, 190), 0);
        assertEquals(1.5, AwardBudgetCuts.findGrantsCap(new double[]{2, 4}, 3), 0);
        assertEquals(128, AwardBudgetCuts.findGrantsCap(new double[]{2,100,50,120,167}, 400), 0);
    }
}