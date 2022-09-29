package task1;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses = new ArrayList<>();


    Student(String name){
        this.name = name;
    }

    public void addCourse(Course x){
        courses.add(x);

    }

    @Override
    public String toString() {
        return "Student{" +
                name + '\'' +
                courses +
                '}';
    }
}
