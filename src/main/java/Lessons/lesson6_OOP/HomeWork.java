package Lessons.lesson6_OOP;



public class HomeWork {
    public static void main(String[] args) {
        simpleZoo();
    }

    public static void simpleZoo() {


        Cat cat = new Cat("Барсик", "Рыжий");
        Dog dog = new Dog("Тузик", "Белый");

        cat.run(150);
        cat.swim();
        dog.run(350);
        dog.swim(15);
    }
}






