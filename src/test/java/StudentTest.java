import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    /**
     * id should be a long number used to represent a "unique user" in our application.
     * name is a String that holds the name of the student.
     * grades is an ArrayList that contains a list of Integer numbers.
     */

    Student student1;


    @Before
    public void setUp(){
        student1 = new Student(123, "Diana Prince");
    }


    @Test
    public void testIfStudentIdExists() {

        assertNotNull(student1);

        assertNotNull(student1.getId());
        assertTrue(student1.getId() >= 100);
        assertNotNull(student1.getName());
        assertNotEquals(student1.getName(), "");
        assertNotNull(student1.getGrades());


        assertEquals(student1.getId(), 123);
        assertEquals(student1.getName(), "Diana Prince");

    }

    @Test
    public void testFieldsIsGetorSet(){

        int[] grades = {80, 90, 95};
        int[] grades2 = {80, 600, 95};

//        Student student1 = new Student(123, "Diana Prince");

        assertNotNull(student1);

        assertNotNull(student1.getId());
        assertTrue(student1.getId() >= 100);
        assertNotNull(student1.getName());
        assertNotEquals(student1.getName(), "");


        assertEquals(student1.getId(), 123);
        assertEquals(student1.getName(), "Diana Prince");

    }

    @Test
    public void testifAddGradeWorks(){
        student1.addGrade(80);
        assertSame(80, student1.getGrades().get(0));
    }

    @Test
    public void testIfGradeAverageIsCorrect(){

        student1.addGrade(80);
        student1.addGrade(90);
        assertEquals(85, student1.getAverageGrade(), 0);
    }

}
