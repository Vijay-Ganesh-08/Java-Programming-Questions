package ArrayList;

/**
 * Expectecd Input :
 * int[] start = { 1, 3, 0, 5, 8, 5 };
 * int[] end = { 2, 4, 6, 7, 9, 9 };
 * Expected Output : 
 * Selected meeting numbers: [1, 2, 4, 5]
 * Maximum meetings: 4
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MeetingScheduler {
    public static void main(String[] args) {

        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        findMeetings(start, end);
    }

    static void findMeetings(int[] start, int[] end) {

        int n = start.length;

        if (n == 0 || n != end.length) {
            System.out.println("Invalid meeting input");
            return;
        }

        // Store meeting number, start time, and end time
        int[][] meetings = new int[n][3];

        for (int i = 0; i < n; i++) {
            meetings[i][0] = i + 1; // Meeting number
            meetings[i][1] = start[i];
            meetings[i][2] = end[i];
        }

        // Sort meetings by end time
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[2]));

        List<Integer> selectedMeetings = new ArrayList<>();

        // Select the first meeting
        selectedMeetings.add(meetings[0][0]);

        int lastEndTime = meetings[0][2];

        // Select subsequent compatible meetings
        for (int i = 1; i < n; i++) {

            if (meetings[i][1] > lastEndTime) {

                selectedMeetings.add(meetings[i][0]);

                lastEndTime = meetings[i][2];
            }
        }

        System.out.println("Selected meeting numbers: " + selectedMeetings);
        System.out.println("Maximum meetings: " + selectedMeetings.size());
    }
}
