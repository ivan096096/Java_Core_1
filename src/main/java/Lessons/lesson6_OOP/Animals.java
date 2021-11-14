package Lessons.lesson6_OOP;


public  class Animals {

    public static int count ;

    protected String  name;
    protected String  color;

    //Создание конструктора
    public Animals(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
        }
        public static int getCount () {
            return count;


        }
    }




