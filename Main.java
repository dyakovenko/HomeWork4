import java.util.Scanner;

/**
 * Created by Admin on 06.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        Teacher bob = new Teacher("M","Bob",45,"Plumber");
        System.out.println(bob.toString());
        CollegeStudent col = new CollegeStudent("Jon","M",33.5,"fgfg1234",16,3,"major");
        System.out.println(col.toString());
        Student st =  new Student();
    }
}
