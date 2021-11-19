package Lessons.lesson7_Practic;

public class Cat extends HomeWork_7 {
    private String Name;
    private int appetit;
    private boolean isSatiety;

    public Cat(String name, int appetit) {
        this.Name = name;
        this.appetit = appetit;
        this.isSatiety = true;
    }


    public void eat(Plate plate) {
        if (isSatiety = !plate.decreaseFood(appetit)) {

            System.out.printf("Кот %s несмог поесть %d еды и он к ней не притронулся\n", Name, appetit);
        } else {
            System.out.printf("Кот %s поел %d еды\n", Name, appetit);
        }
    }

        public boolean isSatiety () {
            return isSatiety;
        }

        @Override
        public String toString () {
            return "Cat{" +
                    "Name='" + Name + '\'' +
                    ", appetit=" + appetit +
                    ", isSatiety=" + isSatiety +
                    '}';
        }
    }



