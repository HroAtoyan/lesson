public class Lesson {


    public static void main(String[] args) {

        Pupil pupil = new Pupil();
        pupil.name = "Vazgen";
        pupil.surname = "Vardanyan";
        pupil.age = 18;
        pupil.gender = 'M';
        pupil.mark = 7.5;

        System.out.println(pupil.name + " " + pupil.surname + " " + pupil.age + " " + pupil.gender + " " + pupil.mark);

        Car car = new Car();
        car.name = "Mercedes";
        car.color = "Red";
        car.speed = 300;
        car.year = 2025;

        System.out.println(car.name + " " + car.color + " " + car.speed + " " + car.year);

        Human human = new Human();
        human.name = "John";
        human.surname = "Doe";
        human.age = 25;
        human.gender = 'M';
        human.job = "programmer";

        System.out.println(human.name + " " + human.surname + " " + human.age + " " + human.gender + " " + human.job);

        Animal animal = new Animal();
        animal.name = "Joni";
        animal.age = 18;
        animal.color = "black";
        animal.type = "Dog";

        System.out.println(animal.name + " " + animal.age + " " + animal.color + " " + animal.type);

        Book book = new Book();
        book.title = "Java";
        book.author = "Vazgen";
        book.pages = 659;
        book.fame = true;
    }
}
