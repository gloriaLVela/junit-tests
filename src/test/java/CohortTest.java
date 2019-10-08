
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class CohortTest {

    /**
     *
     * Part Two: Testing Legacy Code
     * Once you finished the Student.java class.
     *
     * Checkout to the part-two branch, there you will find a Cohort.java class inside the src/main/java folder,
     * this class has already a lot of methods to calculate the cohort average grade and add a student.
     * Let's go ahead and make sure there's sufficient tests for this class to be deploy to production:
     *
     * Create a CohortTest class and create a unit test for each of the following requirements:
     *
     * A Cohort instance can get the current List of students.
     * A Cohort instance can add a Student to the List of students.
     * A Cohort instance can get the average and it's being calculated correctly.
     * Go back to the StudentTest class and refactor the code to avoid any repetition in the test cases,
     * the use of the @Before annotation will be useful to achieve this, do the same with this new CohortTest class
     * if you find any code repetition as well.
     *
     * Bonus
     * Follow the TDD cycle and create a new feature to find students by their ID like: findStudentById(long id) in the Cohort class, remember to create the tests first before any production code.
     */

    Cohort moon;
    List <Student> studentList;

    @Before
    public void setUp(){

        Student person1 = new Student(345, "Peter Parker");
        person1.addGrade(80);
        person1.addGrade(80);


        Student person2 = new Student(350, "Diana Prince");
        person2.addGrade(100);
        person2.addGrade(100);

        moon = new Cohort();

        moon.addStudent(person1);
        moon.addStudent(person2);

        studentList = new ArrayList<>();
        studentList.add(person1);
        studentList.add(person2);

    }

    @Test
    public void testCohortClassExists (){
        assertNotNull(moon );
    }

    /**
     *
     *  A Cohort instance can get the current List of students.
     *
     */
    @Test
    public void testReturnListStudents(){

       assertEquals(moon.getStudents(), studentList);

    }


    /**
     *
     * A Cohort instance can get the average and it's being calculated correctly.
     */

    @Test
    public void testReturnAverageStudents(){
        assertEquals(90, moon.getCohortAverage(), 0);

    }
}
