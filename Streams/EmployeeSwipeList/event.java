package Streams.EmployeeSwipeList;

public class event {
    String empId;
    String event;
    long timeOfEvent;

    event(String empId, String event, long timeOfEvent) {
        this.empId = empId;
        this.event = event;
        this.timeOfEvent = timeOfEvent;
    }
}