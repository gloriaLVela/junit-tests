import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    /**
     *
     * id should be a long number used to represent a "unique user" in our application.
     * name is a String that holds the name of the student.
     * grades is an ArrayList that contains a list of Integer numbers.
     */

    @Test
    public void testIfStudentIdExists() {

        int [] grades = {80, 90, 95};
        int [] grades2 = {80, 600, 95};
       Student student1 = new Student(123, "Diana Prince",grades );
        assertNotEquals(student1.getId(), 479);
        assertEquals(student1.getName(), "Diana Cazadora");
        assertEquals(student1.getName(), "");
        assertEquals(student1.getGrades(), grades2);
       assertEquals(student1.getId(), 123);
       assertEquals(student1.getName(), "Diana Prince");
       assertEquals(student1.getGrades(), grades);

    }

}
