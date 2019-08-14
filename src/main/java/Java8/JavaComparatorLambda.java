package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparatorLambda {
    public static void main(String[] args) {
        Comparator<Employee>comparebyid1 = Comparator.comparing(e->e.getId());
        Comparator<Employee>comparebyAge
                = (Employee e1,Employee e2)->(e1.getAge()).compareTo(e2.getAge());
        Comparator<Employee>comparebyFirstName=Comparator.comparing(e->e.getFirstName());
        List<Employee>employees = Arrays.asList(new Employee(5,10,"e1","tom2")
                ,new Employee(2,16,"e6","tom3")
                ,new Employee(3,6,"e3","tom1")
                ,new Employee(4,3,"e3","tom2")
                ,new Employee(4,3,"e4","tom3"));
        Collections.sort(employees,comparebyid1);
        employees.stream().forEach(System.out::println);
        Collections.sort(employees,comparebyAge);
        employees.stream().forEach(System.out::println);
        Collections.sort(employees,comparebyFirstName);
        employees.stream().forEach(System.out::println);
    }
}
class Employee{
    private Integer id,age;
    private String firstName,lastName;
    Employee(int id,int age,String firstName, String lastName){
        this.id = id;
        this.age = age;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
