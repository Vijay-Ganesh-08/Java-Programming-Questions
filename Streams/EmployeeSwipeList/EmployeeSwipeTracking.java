package Streams.EmployeeSwipeList;

/*
* Expected Input: List of Sample Events for Emp Id E01, E02, E03
* Expected Output: Employees who haven't swiped OUT: [E02, E03]
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeSwipeTracking {
    public static void main(String[] args) {

        List<event> eventList = new ArrayList<>();
        eventList.add(new event("E01", "IN", System.currentTimeMillis()));
        eventList.add(new event("E02", "IN", System.currentTimeMillis()));
        eventList.add(new event("E03", "IN", System.currentTimeMillis()));
        eventList.add(new event("E01", "OUT", System.currentTimeMillis() + 30000));
        getSwipeList(eventList);
    }

    static void getSwipeList(List<event> events) {

        Set<String> employeesIn = events.stream()
                .filter(e -> e.event.equals("IN"))
                .map(e -> e.empId)
                .collect(Collectors.toSet());

        Set<String> employeesOut = events.stream()
                .filter(e -> e.event.equals("OUT"))
                .map(e -> e.empId)
                .collect(Collectors.toSet());

        employeesIn.removeAll(employeesOut);
        System.out.println("Employees who haven't swiped OUT: " + employeesIn);
    }
}
