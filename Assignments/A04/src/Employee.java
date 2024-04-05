import java.util.Objects;

class Employee {
    // Instance variables
    private final String id;
    private String firstName;
    private String lastName;
    private int birthYear;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, int birthYear, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.salary = salary;
        this.id = constructEmployeeID(firstName, lastName, birthYear);
    }

    public String constructEmployeeID(String firstName, String lastName, int birthYear){
        String last = "";
        String birth = String.format("%02d", birthYear% 100);
        int count = 0;
        for(int i = 0; i < lastName.length() && i < 5; i ++){
                last += lastName.charAt(i);
        }
        return last + firstName.charAt(0) + birth;
    }

    // Accessors(get in front of the name)
    public double getSalary() {return salary;}
    public String getfirstName() {return firstName;}
    public String getLastName() {return lastName;}
    public int getBirthYear() {return birthYear;}
    public String getID() {return id;}

    public void bonus() {
        this.salary *= 1.10;
    }


    @Override
    public boolean equals(Object obj) {
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is an instance of Employee
        if (!(obj instanceof Employee)) {
            return false;
        }

        // Typecast obj to Employee so that we can compare data members
        Employee other = (Employee) obj;

        // Compare the employee IDs and return accordingly
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return firstName + ", " + lastName + ", " + birthYear + ", " + salary + ", " + id;
    }
}
