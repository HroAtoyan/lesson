import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {

        boolean isActive = true;
        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();
        Student[] students = new Student[10];
        int indexOfStudent = 0;

        while (isActive) {

            System.out.println("----------------Menu--------------");
            System.out.println("1.                Create Student");
            System.out.println("2.                Max Student");
            System.out.println("3.                Sort females  ");
            System.out.println("4.                Exit          ");
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    if (indexOfStudent >= students.length) {
                        System.out.println("The array is filled");
                        break;
                    }
                    students[indexOfStudent] = service.createStudent();
                    indexOfStudent++;
                    break;
                case 2:
                    if (indexOfStudent < 2) {
                        System.out.println("The list still has no to students");
                        System.out.println("Please create students");
                        break;
                    }
                    service.maxStudent(students[0], students[1]);
                    break;
                case 3:
                    if (indexOfStudent == 0) {
                        System.out.println("No students in the list");
                        break;
                    }
                    Student[] filledArray = new Student[indexOfStudent];
                    for (int i = 0; i < indexOfStudent; i++) {
                        filledArray[i] = students[i];
                    }
                    for (Student x : service.sortFemales(filledArray)) {
                        x.printInfo();
                    }
                    break;
                case 4:
                    isActive = false;
            }
        }

    }
}
