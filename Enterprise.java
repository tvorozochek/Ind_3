package javaapplication2;
import java.util.*;

public class Enterprise {
    ArrayList<Employer> emp = new ArrayList<>();
    
    public void addEmployer(Employer e)
    {
        emp.add(e);
    }
    
    public void removeEmployer(String name)
    {
        for(Employer e: emp)
        {
            if(e.getName().equals(name))
            {
                int ind = emp.indexOf(e);
                emp.remove(ind);
                System.out.println("Employer was deleted");
                return;
            }
        }
        System.out.println("Employer not found");
        return;
    }
    
    public void findByName(String name)
    {
        for(Employer e: emp)
        {
            if(e.getName().equals(name))
            {
                System.out.println(e.toString());
                return;
            }
        }
        System.out.println("Employer not found");
        return;
    }
    
    public void sortByName()
    {
        emp.sort(Comparator.comparing(e->e.getName()));
    }
    
    public void sortByAge()
    {
        emp.sort(Comparator.comparing(e->e.getAge()));
    }
    
    public void printAll()
    {
        for(Employer e: emp)
        {
            System.out.println(e.toString());
        }
    }
}
