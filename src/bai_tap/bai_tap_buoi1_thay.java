package bai_tap;

import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;

public class bai_tap_buoi1_thay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ho ten hs: ");
        String hoTen=sc.nextLine();//che quynh

        System.out.print("Nhap diem toan: ");
        float diemToan=sc.nextFloat();// 7

        System.out.print("Nhap diem ly: ");
        float diemLy=sc.nextFloat(); // 6.5

        //process: tinh diem trung binh
        float   diemTb = (diemLy + diemToan) / 2;

        //output: in diem ra
        System.out.print("ho ten: " + hoTen);
        System.out.print("diem toan: " + diemToan);
        System.out.print("diem ly: " + diemLy);
        System.out.print("diem tb: " + diemTb);
        sc.nextLine();


        //bai 2:
        //input: ho ten, luong co ban, so ngay lam viec
        System.out.println("Nhap ho ten: ");
        String FullName=sc.nextLine();

        System.out.print("Nhap luong co ban : ");
        double luongCb=sc.nextDouble();

        System.out.print("work days : ");
        double workDays=sc.nextInt();

        System.out.print("Net salary: ");
        //process: tinh luong
        double netSalary= luongCb * workDays;
        //output: in thoong tin
        System.out.println("Net salary is: " + netSalary);

    }
}
