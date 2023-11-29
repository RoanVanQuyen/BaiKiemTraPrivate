package Bai_2;

public class Student extends Person{
    private double score ;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public Student() {}
    public Student(double score) {
        this.score = score;
    }

    public Student(String name, Short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    @Override
    public String getCapacity() {
        if(score >= 9){
            return "Hoc Luc Xuat Sac" ;
        }
        else{
            if(score >= 8) return"Hoc luc gioi" ;
            else{
                if(score >= 6.5) return  "Hoc luc kha" ;
                else{
                    return "Hoc luc trung binh yeu" ;
                }
            }
        }
    }
}
