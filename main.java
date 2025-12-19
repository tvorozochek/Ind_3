package javaapplication2;
import java.util.*;

public class JavaApplication2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        
        System.out.print("Kol-vo emp = ");
        int k = sc.nextInt();
        
        String name; int age; String position; double salary;
        Enterprise ent = new Enterprise();
        
        for(int i=0;i<k;i++)
        {
            System.out.print("Name = ");
            name = ssc.nextLine();
            System.out.print("Age = ");
            age = sc.nextInt();
            System.out.print("Position = ");
            position = ssc.nextLine();
            System.out.print("Salary = ");
            salary = sc.nextDouble();
            System.out.println("");
            
            Employer emp = new Employer(name,age,position,salary);
            ent.addEmployer(emp);
        }
        
        while(true)
        {
            System.out.println("What you want to do?"+ "\n1)Delete employer" + "\n2)Find employer by name" + "\n3)Sort list by name" + "\n4)Sort list by age" + "\n5)Stop");
            int n = sc.nextInt();
            switch(n)
            {
                case 1:
                    name = ssc.nextLine();
                    ent.removeEmployer(name);
                    ent.printAll();
                    break;
                case 2:
                    name = ssc.nextLine();
                    ent.findByName(name);
                    break;
                case 3:
                    ent.sortByName();
                    ent.printAll();
                    break;
                case 4:
                    ent.sortByAge();
                    ent.printAll();
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
