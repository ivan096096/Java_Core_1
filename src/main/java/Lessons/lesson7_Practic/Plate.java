package Lessons.lesson7_Practic;

public class Plate extends HomeWork_7 {

    public int foodAmount;


    public void putFood(int amount) {
        this.foodAmount += amount;

        System.out.printf("Колличества кошачьей еды увеличелось на %d граммов,и теперь в тарелке есть %d граммов еды\n", amount, foodAmount);
    }

    public boolean decreaseFood(int amount) {
//        int fullPlate = foodAmount - amount;
//        if (fullPlate < amount)
        if (foodAmount < amount) {
            System.out.printf("Вы хотите %d, а есть %d\n", amount, foodAmount);
            return false;
        }
                foodAmount -= amount;
                System.out.printf("Колличества кошачьей еды уменьшилось на %s граммов,и теперь в тарелке есть %d граммов еды\n", amount, foodAmount);
                return true;
            }
        }



