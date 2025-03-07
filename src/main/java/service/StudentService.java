package service;

import model.Student;

public class StudentService {

    public Student createStudent(String name, String surname, int age, double mark, char gender, boolean isPHD) {

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setMark(mark);
        student.setGender(gender);
        student.setPHD(isPHD);
        return student;

    }

    public void maxStudent(Student s1, Student s2) {
        if (s1.getAge() > s2.getAge()) {
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

}
