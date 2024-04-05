import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class JobTest {
    Job job;
    Employee employee1;
    Employee employee2;
    Employee employee3;

    @BeforeEach
    void setUp() {
        job = new Job();
        employee1 = new Employee("John", "Doe", 1980, 60000.00);
        employee2 = new Employee("Jane", "Doe", 1985, 65000.00);
        employee3 = new Employee("Jim", "Beam", 1975, 70000.00);
    }

    @Test
    void addAndRemoveEmployee() {
        assertTrue(job.getEmployees().isEmpty(), "Job should start with no employees.");

        job.addEmployee(employee1);
        job.addEmployee(employee2);
        assertEquals(2, job.getEmployees().size(), "Job should have 2 employees after addition.");

        job.removeEmployee(employee1);
        assertEquals(1, job.getEmployees().size(), "Job should have 1 employee after removal.");
        assertEquals(employee2, job.getEmployees().get(0), "The remaining employee should be employee2.");
    }

    @Test
    void computeAverageSalary() {
        job.addEmployee(employee1);
        job.addEmployee(employee2);
        Optional<Double> averageSalary = job.computeAverageSalary();
        assertTrue(averageSalary.isPresent(), "Average salary should be present.");
        assertEquals((60000.00 + 65000.00) / 2, averageSalary.get(), "Average salary should be correctly computed.");
    }

    @Test
    void highestPaid() {
        job.addEmployee(employee1);
        job.addEmployee(employee2);
        job.addEmployee(employee3);
        Optional<Employee> highestPaid = job.highestPaid();
        assertTrue(highestPaid.isPresent(), "There should be a highest-paid employee.");
        assertEquals(employee3, highestPaid.get(), "The highest-paid employee should be employee3.");
    }

    @Test
    void testToString() {
        job.addEmployee(employee1);
        String result = job.toString();
        assertTrue(result.contains(employee1.toString()), "toString should include employee1's information.");
    }
}
