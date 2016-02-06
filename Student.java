/**
 * Created by Admin on 06.02.2016.
 */
public class Student extends Person {
    private String idNuber;
    private double gpa;



    public String getIdNuber() {
        return idNuber;
    }

    public void setIdNuber(String idNuber) {
        this.idNuber = idNuber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()+", IdNuber "+idNuber+", Gpa "+gpa;
    }
}
