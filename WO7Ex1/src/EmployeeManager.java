import java.util.HashSet;
import java.util.Set;

public class EmployeeManager {
    private Set<String> employees;

    public EmployeeManager() {
        employees = new HashSet<>();
    }

    public void Employees(String name) {
        if(employees.add(name)){
            
        }
    }
}
