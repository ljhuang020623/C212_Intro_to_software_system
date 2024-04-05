import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

class Job {
    // Four important in object-oriented programming: Instance Variable, Constructor, Accessor(getter), Mutator(setter)
    // Instance variable
    private ArrayList<Employee> employees;

    // Constructor
    public Job(){
        this.employees = new ArrayList<>() ;
    }

    // Accessor (getter) for the employees list
    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    // Mutator (setter) for the employees list
    public void setEmployee(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee e){
        this.employees.add(e);
    }
    public void removeEmployee(Employee e) {
        this.employees.remove(e);
    }

    public Optional<Double> computeAverageSalary() {
        if (employees.isEmpty()){
            return Optional.empty();
        }else{
            double sum = 0;
            for (Employee employee : employees){
                sum += employee.getSalary();
            }
            double averageSalary = sum / employees.size();
            return Optional.of(averageSalary);
        }
    }

    public Optional<Employee> highestPaid() {
        double max = 0;
        if (employees.isEmpty()){
            return Optional.empty();
        }else{
            Employee highestPaidemployee = employees.get(0) ;
            for (Employee employee : employees){
                if(employee.getSalary() > highestPaidemployee.getSalary()){
                    highestPaidemployee = employee;
                }
            }
            return Optional.of(highestPaidemployee);
        }
    }

    @Override
    public String toString() {
        return employees.toString();
    }
}
