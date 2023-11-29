package Bai_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        StudentServiceipml students = new StudentServiceipml(new ArrayList<Student>()) ;
        students.addStudent((new Student("Roan Van Quyen" , (short) 20, new Address("Giao Thuy" , "Nam Dinh") , 9)));
        students.addStudent((new Student("Le Thi Linh" , (short) 19, new Address("Hung Ha" , "Thai Binh") , 8.5)));
        students.addStudent((new Student("Le Van anh" , (short) 20, new Address("Sam Son" , "Thanh Hoa") ,  7)));
        int choose = 0 ;
        Scanner Ip = new Scanner(System.in) ;
        do {
            System.out.println("1: Them thong tin sinh vien\n2:xoa sinh vien theo id\n3:Tim kiem sinh vien theo ten\n4:Sap xep sinh vien theo diem giam dan\n5:Hien thi danh sach sinh vien\n0:Thoat chuong trinh\n");
            System.out.printf("Mời bạn nhập lựa chọn : ");
            choose = Ip.nextInt() ;
            if(choose == 1){
                System.out.println("NHẬP VÀO THÔNG TIN MỘT SINH VIÊN");
                Ip.nextLine() ;
                System.out.printf("Nhap vao ho ten: ");
                String name = Ip.nextLine() ;
                Short age ;
                do {
                    System.out.printf("Nhap vao tuoi: ");
                    age = Ip.nextShort();
                }while(age < 0) ;
                Ip.nextLine() ;
                System.out.printf("Nhap vao huyen: ");
                String district = Ip.nextLine() ;
                System.out.printf("Nhap vao thanh pho: ");
                String city = Ip.nextLine() ;
                System.out.printf("nhap vao diem cua sinh vien(VD:8,5 ): ");
                Double score = Ip.nextDouble() ;
                while (score < 0 || score > 10){
                    System.out.printf("Nhap lai diem sinh vien: ");
                    score = Ip.nextDouble() ;
                }
                students.addStudent(new Student(name , age , new Address(district , city) , score));
            }
            if(choose == 2){
                System.out.printf("Nhap vao id sinh vien muon xoa: ");
                int id = Ip.nextInt() ;
                students.deleteStudent(id);
            }
            if(choose == 3){
                Ip.nextLine() ;
                System.out.printf("Tim kiem sinh vien theo ten: ");
                String name = Ip.nextLine() ;
                students.searchStudent(name);
            }
            if(choose == 4){
                System.out.println("-Sap xep sinh vien theo diem giam dan thanh cong");
                students.sortedStudent();
            }
            if(choose == 5){
                students.showAllStudent();
            }
            if(choose == 0){
                return ;
            }
        }while(true) ;
    }
}
