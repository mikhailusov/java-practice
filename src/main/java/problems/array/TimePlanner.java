package problems.array;

/**
 * from pramp.com
 *
 * Implement a function meetingPlanner that given the availability, slotsA and slotsB, of two people and a meeting
 * duration dur, returns the earliest time slot that works for both of them and is of duration dur. If there is no
 * common time slot that satisfies the duration requirement, return null.
 *
 * In your implementation assume that the time slots in a person’s availability are disjointed, i.e, time slots in a
 * person’s availability don’t overlap. Further assume that the slots are sorted by slots’ start time.
 */
public class TimePlanner {

    static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {

        for (int i = 0, j = 0; i < slotsA.length && j < slotsB.length; i++) {

            if (slotsA[i][0] >= slotsB[j][1]) {
                j++;
                i--;
                continue;
            } else if (slotsB[j][0] >= slotsA[i][1]) {
                continue;
            }

            int minStart  = Math.max(slotsA[i][0], slotsB[j][0]);
            int maxFinish = Math.min(slotsA[i][1], slotsB[j][1]);

            if (maxFinish - minStart >= dur) {
                return new int[]{minStart, minStart + dur};
            }
            j++;
        }

        return null;
    }
}
