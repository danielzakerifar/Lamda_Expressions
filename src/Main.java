import java.util.*;

public class Main {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("printing from the Runnable");
//            }
//        }).start();
       new Thread(()->System.out.println("Printing from the Runnable")).start();
       new Thread(()-> {
            System.out.println("Printing from the Runnable");
            System.out.println("Line 2");
            System.out.format("This is line %d\n",3);
        }).start();
    Employee john = new Employee("Jogn Doe",30);
    Employee jim = new Employee("Jim Buch", 34);
    Employee tin = new Employee("tin timmi", 45);
    Employee lin = new Employee("lin tinni", 25);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(jim);
        employees.add(tin);
        employees.add(lin);

        Collections.sort(employees, new Comparator<Employee>() {
                    @Override
                    public int compare(Employee employee1, Employee employee2) {
                        return employee1.getName().compareTo(employee2.getName());
                    }
                });
        for(Employee employee : employees) {
            System.out.println(employee.getName());
        }


    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
}

class CodeToRun implements  Runnable {
    @Override
    public void run() {
        System.out.println("Printing from the Runnable");
    }
}
