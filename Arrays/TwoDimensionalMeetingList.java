package Arrays;

/**
 * Expectecd Input : ** As Below **
 * Expected Output : 
 * Meeting Length : 5
 * Meetings that can be held: 1 2 3 4
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TwoDimensionalMeetingList {
    public static void main(String[] args) {
        double[][] meetingTime = new double[5][2];
        meetingTime[0][0] = 9.00;
        meetingTime[0][1] = 10.30;
        meetingTime[1][0] = 11.00;
        meetingTime[1][1] = 12.30;
        meetingTime[2][0] = 13.00;
        meetingTime[2][1] = 14.30;
        meetingTime[3][0] = 15.00;
        meetingTime[3][1] = 16.30;
        meetingTime[4][0] = 16.00;
        meetingTime[4][1] = 18.30;

        // Step 1: Add index to each meeting
        int n = meetingTime.length;
        System.out.println("Meeting Length : " + n);
        double[][] meetings = new double[n][3]; // start, end, index
        for (int i = 0; i < n; i++) {
            meetings[i][0] = meetingTime[i][0];
            meetings[i][1] = meetingTime[i][1];
            meetings[i][2] = i + 1; // 1-based index
        }

        // Step 2: Sort meetings by end time
        Arrays.sort(meetings, Comparator.comparingDouble(a -> a[1]));
        // Step 3: Greedily select meetings
        List<Integer> selectedMeetings = new ArrayList<>();
        double lastEndTime = -1;

        for (int i = 0; i < n; i++) {
            double start = meetings[i][0];
            double end = meetings[i][1];
            int index = (int) meetings[i][2];

            if (start > lastEndTime) { // strictly greater
                selectedMeetings.add(index);
                lastEndTime = end;
            }
        }

        // Output the result
        System.out.print("Meetings that can be held: ");
        for (int index : selectedMeetings) {
            System.out.print(index + " ");
        }
    }

}
