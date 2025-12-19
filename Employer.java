package javaapplication2;
import java.util.*;

public class Employer {
    String name;
    int age;
    String position;
    double salary;
    
    Employer(String name, int age, String position, double salary)
    {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }
    
    public String toString()
    {
        return "Name: " + name + "\nAge: " + age + "\nPosition: " + position + "\nSalary: " + salary;
    }
  
    String getName()
    {
        return name;
    }
    
    int getAge()
    {
        return age;
    }
    
    String getPosition()
    {
        return position;
    }
    
    double getSalary()
    {
        return salary;
    }
}
