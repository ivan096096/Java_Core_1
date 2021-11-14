package Lessons.lesson6_OOP;


public class Cat extends Animals {

    protected final int max_run = 185;


   public Cat(String name, String color) {
        super(name, color);
     }

    public void run(int lenght) {
        if (lenght <= max_run) {
            System.out.printf("Кот по имени %s,%s окрас пробежит %d \n",name,color,max_run);
        } else {
            System.out.printf("Кот по имени %s,%s окрас не пробежит \n",name,color);
        }
    }

    public void swim() {
        System.out.printf("%s Не Плавает  \n", name);
    }
}


