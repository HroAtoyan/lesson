import model.Student;
import service.StudentService;

public class Lesson {

    public static void main(String[] args) {


        StudentService service = new StudentService();

        Student s = service.createStudent("Anna", "Martirosyan", 20, 78.9, 'F', true);
        Student s1 = service.createStudent("Hayk", "Vardanyan", 25, 89.3, 'M', false);

        service.maxStudent(s, s1);

    }
}
