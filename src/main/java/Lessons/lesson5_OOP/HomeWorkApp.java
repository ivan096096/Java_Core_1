package Lessons.lesson5_OOP;

public class HomeWorkApp {
    public static void main(String[] args) {

        myWorkers[] workersArr = new myWorkers[5];

        workersArr[0] = new myWorkers("Vladimir Vladimirovich Putin",
                "Janitor", "Yandex", 101, 1500, 65);

        workersArr[1] = new myWorkers("Dmitry Anatolyevich Medvedev",
                "Plumber", "Mail", 102, 2000, 55);

        workersArr[2] = new myWorkers("Lebedev Stepan Ivanovich",
                "The president", "Gmail", 103, 20000, 10);

        workersArr[3] = new myWorkers("Mishustin Mikhail Vladimirovich",
                "Welder", "Mail", 104, 500, 35);

        workersArr[4] = new myWorkers("Golikova Tatiana Alekseevna",
                "Economist", "mail", 105, 700, 38);
        System.out.println();
        for (int i = 0; i < workersArr.length; i++) {
            if (workersArr[i].age >= 40) {
                System.out.println(i+" " +workersArr[i].name);
            }

        }


    }
}
