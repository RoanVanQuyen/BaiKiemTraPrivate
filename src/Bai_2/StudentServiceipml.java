package Bai_2;

import java.util.ArrayList;

public class StudentServiceipml implements StudentService{
    private ArrayList<Student> students ;
    @Override
    public void addStudent(Student t) {
        students.add(t) ;
    }

    @Override
    public void deleteStudent(int id) {
        Student ans = new Student() ;
        int check = 0 ;
        for(int i = 0 ; i < students.size() ; i++){
            if(students.get(i).getId() == id){
                ans = students.get(i) ;
                check =1 ;
                break ;
            }
        }
        if(check == 1) System.out.println("-Xoa thanh cong sinh vien");
        else System.out.println("-Khong tim thay sinh vien de xoa");
        students.remove(ans) ;
    }

    @Override
    public void searchStudent(String name) {
        StudentServiceipml studentByName= new StudentServiceipml(new ArrayList<Student>() ) ;
        for(Student x : students){
            if(x.getName().trim().equals(name.trim() )){
                studentByName.addStudent(x);
            }
        }
        studentByName.showAllStudent(); ;
    }
    @Override
    public void sortedStudent() {
        students.sort((o1,o2)-> {
            double ans = o2.getScore() - o1.getScore() ;
            return ans > 0 ? 1 : ans==0 ? 0 : -1 ;
        }) ;
    }

    @Override
    public void showAllStudent() {
        System.out.printf("%-12s %-25s %-15s %-20s %-20s %-20s %-30s" ,  "Id" , "Name" , "Age" , "District" , "City", "Score" , "Capacity");
        System.out.println();
        for(Student x: students){
            System.out.printf("%-12d %-25s %-15d %-20s %-20s %-20f %-30s" , x.getId() ,x.getName() , x.getAge() , x.getAddress().getDistrict() , x.getAddress().getCity() , x.getScore() , x.getCapacity());
            System.out.println();
        }
    }

    public StudentServiceipml(ArrayList<Student> students) {
        this.students = students;
    }
    public StudentServiceipml(){}
}
