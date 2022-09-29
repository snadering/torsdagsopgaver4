package task1;

public class TestStudents {

    public static void main(String[] args) {
        Student a = new Student("Tobias");
        Student b = new Student("Bastian");
        Student c = new Student("Sander");

        Course math = new Course("Mathematics");
        Course pro = new Course("Programming");
        Course eng = new Course("English");

        a.addCourse(math);
        b.addCourse(pro);
        c.addCourse(eng);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

}
