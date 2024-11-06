import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student.getInstance();
        Student student = Student.getInstance();
        Student student2 = Student.getInstance();
        student.setId(1);
        student2.setId(2);
        student.setName("RIki");
        student2.setName("Miki");
        System.out.println(student);
        System.out.println(student2);



//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(student);
//        System.out.println(studentsList);

    }
}