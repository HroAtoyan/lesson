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
        } else {
            s2.printInfo();
        }
    }

    public void girlStudents(Student[] students) {
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

    public Student[] isPhdStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].isPHD()) {
                students[i].printInfo();
            }
        }
        return students;
    }

    public void minGirlStudents(Student[] students) {
        Student min = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getYear() > min.getYear() && students[i].getGender() == 'F') {
                min = students[i];
                min.printInfo();
            }
        }
    }

    public Student[] sortMark(Student[] students) {
        if (students == null || students.length == 0) {
            System.out.println("No students found");
            return students;
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].getMark() > students[j + 1].getMark()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;

    }

    public void maxBoyStudents(Student[] students) {
        Student max = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() > max.getMark() && students[i].getGender() == 'M') {
                max = students[i];
            }
        }
        if (max != null) {
            max.printInfo();
        } else {
            System.out.println("No male students found.");
        }
    }

    public Student[] isPhdMaxMark(Student[] students) {
        Student max = students[0];
        for (int i = 0; i < students.length; i++) {
            if (students[i].getMark() > max.getMark() && students[i].isPHD()) {
                max = students[i];
            }
        }
        return new Student[]{max};
    }
}
