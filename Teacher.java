import java.util.Scanner;

/**
 * Created by Admin on 06.02.2016.
 */
public class Teacher extends Person {

    private double salary;
    private String subject;

    public double getSalary(){
        double salary = 0;
        switch (subject){
            case "Plumber":
                salary=20.666;
                break;
            case "chemical":
                salary = 10.345;
                break;

        }return salary;
    }


    public Teacher(String gender, String name, int age,  String subject) {


        this.subject = subject;
        super.age = age;
        super.name = name;
        super.setGender(gender);
    }
    public String toString(){
        return super.toString()+ ", Subject: "+subject+", Salary: "+getSalary();
    }
}
