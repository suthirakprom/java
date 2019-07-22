import java.util.*;

class Employee {
    private Integer id; 
    private String name; 
    private String city;
 
    //  constructor private Employee(Integer id, String name, String city) 
    public Employee(Integer id, String name, String city)
    {
        this.id = id;
        this.name = name;
        this.city = city; 
    }
 public Integer getId() 
    {
        return id; 
    }
 public void setId(Integer id) 
    {
        this.id = id; 
    }
 public String getName() 
    {
        return name;
    }
 public void setName(String name) 
    {
		this.name = name;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

public class userDefinedObjects
{
    public static void main (String[] args)
    {
        Map<Integer, Employee> employeeMap = new HashMap<>();

        employeeMap.put(1001, new Employee(1001, "Jin", "Phnom Penh"));
        employeeMap.put(1002, new Employee(1002, "Jason", "Kirirom"));
        employeeMap.put(1003, new Employee(1003, "Jack", "New York"));

        System.out.println(employeeMap);
    }
}