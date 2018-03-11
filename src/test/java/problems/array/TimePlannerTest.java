package problems.array;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class TimePlannerTest {

    @Test
    public void meetingPlanner() {
        assertArrayEquals(new int[]{60, 68},
                TimePlanner.meetingPlanner(new int[][]{{10,50}, {60, 120}, {140, 210}}, new int[][]{{0,15}, {60, 70}}, 8));
        assertArrayEquals(new int[]{10, 15},
                TimePlanner.meetingPlanner(new int[][]{{10,50}, {60, 120}, {140, 210}}, new int[][]{{0,15}, {60, 70}}, 5));
        assertArrayEquals(null,
                TimePlanner.meetingPlanner(new int[][]{{10,50}, {60, 120}, {140, 210}}, new int[][]{{0,15}, {60, 70}}, 12));
        assertArrayEquals(null, TimePlanner.meetingPlanner(new int[][]{}, new int[][]{{0,15}, {60, 70}}, 1));
        assertArrayEquals(null, TimePlanner.meetingPlanner(new int[][]{}, new int[][]{{0,15}, {60, 70}}, 0));
        assertArrayEquals(null, TimePlanner.meetingPlanner(new int[][]{}, new int[][]{}, 0));
    }
}