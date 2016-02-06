/**
 * Created by Admin on 06.02.2016.
 */
public abstract class Person {
    String name;
     int age;
    private String gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if ((gender.equals("M"))||(gender.equals("F")))
        this.gender = gender;
        else System.out.println("No correct Gender ");
    }


    @Override
    public String toString() {
        return "Name "+name+", Age "+age+", Gender "+getGender();
    }
}
