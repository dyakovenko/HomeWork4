/**
 * Created by Admin on 06.02.2016.
 */
public class CollegeStudent extends Student {

    private int year;
    private String major;

    public CollegeStudent( String name,String gender,double gpa,String idNumber, int age,int year, String major) {

        this.year = year;
        this.major = major;
        super.name =  name;
        super.setGender(gender);
       super.age=age;
       super.setIdNuber(idNumber);
        super.setGpa(gpa);

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return super.toString()+", Yar "+year+", Major "+major;
    }
}
