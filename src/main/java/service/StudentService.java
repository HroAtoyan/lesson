package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter name: ");
        String name = scanner.next();
        System.out.println("Enter surname: ");
        String surname = scanner.next();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        System.out.println("Enter mark: ");
        double mark = scanner.nextDouble();
        System.out.println("Enter gender: ");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter PHD: ");
        boolean isPHD = scanner.nextBoolean();

        student.setName(name);
        student.setSurname(surname);
        student.setYear(year);
        student.setMark(mark);
        student.setGender(gender);
        student.setPHD(isPHD);
        return student;

    }

    public void maxStudent(Student s1, Student s2) {
        if (s1.getYear() < s2.getYear()) {
            s1.printInfo();
        }else {
            s2.printInfo();
        }
    }

    public void girlStudents(Student [] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'M') {
                students[i].printInfo();
            }
        }
    }

    public void maxMarkStudent(Student[] students) {
        Student max = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() > students[i + 1].getMark() && students[i].isPHD()) {
                students[i].printInfo();
                max = students[i];
            }
        }
    }
    public Student[] sortFemales(Student[] students) {
        int count = 0;
        for (Student s : students) {
            if (s.getGender() == 'F') {
                count++;
            }
        }
        Student[] result = new Student[count];
        if (count == 0) {
            System.out.println("No girls found");
            return result;
        }

        for (int i = 0, j = 0; i < students.length; i++) {
            if (students[i].getGender() == 'F') {
                result[j] = students[i];
                j++;
            }
        }
        return result;
    }

}
