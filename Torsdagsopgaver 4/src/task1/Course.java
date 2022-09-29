package task1;

public class Course {

    private String name;

    Course(String name){
        this.name = name;

    }

    @Override
    public String toString() {
        return "Course{" +
                name + '\'' +
                '}';
    }
}
