package com.Stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InterviewQ {
    public static class Employee{
        String name;
        String department;
        int salary ;
        public Employee(String name, String department, int salary){
            this.name=name;
            this.department=department;
            this.salary=salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", department='" + department + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = createEmployeeList();
        employees.stream().sorted((e1,e2) -> Integer.compare(e2.salary,e1.salary)) // descending order
                .limit(3).forEach(System.out::println);
    }
    public static List<Employee>createEmployeeList(){
        return List.of(new Employee("Karan", "IT", 100000),
                new Employee("Saurave", "Technical Support",90000 ),
                new Employee("Sohan","Civil",80000),
                new Employee("Bittu", "Consulting", 70000));
    }
}
