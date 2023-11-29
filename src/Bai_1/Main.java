package Bai_1;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner Ip = new Scanner(System.in) ;
        int nhon=0 , vuong = 0 , tron = 0;
        int ansN = 0 , ansV = 0 , ansT = 0 ;
        System.out.printf("Nhap vao chuoi: ");
        String s = Ip.next() ;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '{') nhon++;
            if(s.charAt(i) == '(') tron++;
            if(s.charAt(i) == '[') vuong++;
            if(s.charAt(i) == '}'){
                if(nhon > 0) {
                    ansN++;
                    nhon--;
                }
                else {
                    System.out.println("False");
                    return;
                }
            }
            if(s.charAt(i) == ')'){
                if(tron > 0) {
                    ansT++;
                    tron--;
                }
                else{
                    System.out.println("False");
                    return;
                }
            }
            if(s.charAt(i) == ']'){
                if(vuong > 0) {
                    ansV++;
                    vuong--;
                }
                else {
                    System.out.println("False");
                    return;
                }
            }
        }
        if(vuong > 0 || tron > 0 || nhon > 0){
            System.out.println("False");
            return;
        }
        System.out.println("True" + '\n' +  "()" + ansT + '\n' + "[]" + ansV + '\n' +"{}" + ansN ) ;
    }
}