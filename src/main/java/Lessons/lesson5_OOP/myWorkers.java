package Lessons.lesson5_OOP;

public class myWorkers {
    String name;
    String post;
    String email;
    int telephone;
    int salary;
    int age;

    public myWorkers(String name, String post, String email, int telephone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;

        System.out.printf("Name : %s;\nPost : %s;\n Email : %s ; \nTelephone : %d ;\n Salary : %d;\n Age : %d\n",
                this.name,this.post,this.email,this.telephone,this.salary,this.age);
    }

}
