package Streams.EmployeeSalaryCalc;

/*
Sum of Salary by Dept
Finance -> 50000.0
HR -> 100000.0
IT -> 130000.0
------------------------
Avg of Salary by Dept
Finance -> 50000.0
HR -> 50000.0
IT -> 65000.0
------------------------
Highest of Salary by Dept
Finance -> David (50000.0)
HR -> Eve (55000.0)
IT -> Charlie (70000.0)
------------------------
Lowest of Salary by Dept
Finance -> David (50000.0)
HR -> Bob (45000.0)
IT -> Alice (60000.0)
*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 60000),
                new Employee("Bob", "HR", 45000),
                new Employee("Charlie", "IT", 70000),
                new Employee("David", "Finance", 50000),
                new Employee("Eve", "HR", 55000));
        System.out.println("------------------------");

        // Sum of Salary by Dept
        Map<String, Double> totalSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println("Sum of Salary by Dept");
        totalSalaryByDept.forEach((dept, total) -> System.out.println(dept + " -> " + total));
        System.out.println("------------------------");

        // Avg of Salary by Dept
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("Avg of Salary by Dept");

        avgSalaryByDept.forEach((dept, avg) -> System.out.println(dept + " -> " + avg));
        System.out.println("------------------------");

        // Highest of Salary by Dept
        Map<String, Optional<Employee>> maxSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Highest of Salary by Dept");

        maxSalaryByDept.forEach((dept, emp) -> System.out
                .println(dept + " -> " + emp.get().getName() + " (" + emp.get().getSalary() + ")"));
        System.out.println("------------------------");

        // Lowest of Salary by Dept
        Map<String, Optional<Employee>> minSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("Lowest of Salary by Dept");

        minSalaryByDept.forEach((dept, emp) -> System.out
                .println(dept + " -> " + emp.get().getName() + " (" + emp.get().getSalary() + ")"));
        System.out.println("------------------------");
    }
}
