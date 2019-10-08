import java.util.ArrayList;

public class Student {

    /**
     * id should be a long number used to represent a "unique user" in our application.
     * name is a String that holds the name of the student.
     * grades is an ArrayList that contains a list of Integer numbers.
     *
     */

    private long id;
    private String name;
    private ArrayList <Integer> grades;


    Student(long id, String name){

        this.id = id;
        this.name = name.trim();
        this.grades = new ArrayList<>();

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

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

//    public void setGrades(ArrayList<Integer> grades) {
//        this.grades = grades;
//    }

    public void addGrade(int grade){
        this.grades.add(grade);

    }

    public double getAverageGrade() {
        double avrg = 0;
        for(int grade: this.grades){
            avrg += grade;
        }
        return avrg/this.grades.size();
    }
}
