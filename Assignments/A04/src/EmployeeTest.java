import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testEmployeeConstructorAndGetters() {
        Employee employee = new Employee("Joshua", "Crotts", 1980, 50000.00);
        assertEquals("John", employee.getfirstName(), "First name should match");
        assertEquals("Doe", employee.getLastName(), "Last name should match");
        assertEquals(1980, employee.getBirthYear(), "Birth year should match");
        assertEquals(50000.00, employee.getSalary(), "Salary should match");
        assertEquals("DoeJ80", employee.getID(), "ID should be constructed correctly");
    }

    @Test
    void testBonus() {
        Employee employee = new Employee("Joshua", "Crotts", 1985, 50000.00);
        employee.bonus();
        assertEquals(55000.00, employee.getSalary(), "Salary should increase by 10%");
    }

    @Test
    void testEquals() {
        Employee employee1 = new Employee("John", "Doe", 1980, 50000.00);
        Employee employee2 = new Employee("John", "Doe", 1980, 50000.00);
        Employee employee3 = new Employee("Jane", "Doe", 1985, 50000.00);

        assertEquals(employee1, employee2, "Employees with the same ID should be equal");
        assertNotEquals(employee1, employee3, "Employees with different IDs should not be equal");
    }

    @Test
    void testToString() {
        Employee employee = new Employee("Joshua", "Crotts", 1980, 50000.00);
        String expected = "John, Doe, 1980, 50000.00, DoeJ80";
        assertEquals(expected, employee.toString(), "toString should return the correct format");
    }
}
