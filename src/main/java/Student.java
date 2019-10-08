public class Student {

    /**
     * id should be a long number used to represent a "unique user" in our application.
     * name is a String that holds the name of the student.
     * grades is an ArrayList that contains a list of Integer numbers.
     */

    private long id;
    private String name;
    private int[] grades;


    Student(long id, String name, int[] grades){
        this.id = id;
        this.name = name;
        this.grades = grades;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
