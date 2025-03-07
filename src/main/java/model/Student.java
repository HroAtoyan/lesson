package model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private double mark;
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPHD() {
        return isPHD;
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Mark: " + mark);
        System.out.println("Gender: " + (gender == 'F' ? "Female" : "Male"));
        System.out.println("Is PHD: " + (isPHD ? "Yes" : "No"));
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private boolean isPHD;
}
