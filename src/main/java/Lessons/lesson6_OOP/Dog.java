package Lessons.lesson6_OOP;

public class Dog extends Animals {

    protected final int max_run = 450;//максимальная дистанция бега
    protected final int max_swim = 10;//максимальная дистанция плавания

    public Dog(String name,String color) {
        super(name, color);
        }
    //Сравнение дистанции бега у собаки
    public void run(int lenght) {
       if (lenght <= max_run){
           System.out.printf("Собака по имени %s,%s окрас пробежит %d \n",name,color,max_run);
       }else {
           System.out.printf("Собака по имени %s,%s окрас не пробежит %d \n",name,color,max_run);
       }

    }
    //   Сравнение  дистанции Плавание  у собаки
    public void swim(int lenght) {
        if (lenght <= max_swim) {
            System.out.printf("Собака по имени %s,%s окрас проплывёт %d \n",name,color,max_swim);
        } else {
            System.out.printf("Собака по имени %s,%s окрас не проплывёт  %d \n",name,color,max_swim);
        }

    }

    }

