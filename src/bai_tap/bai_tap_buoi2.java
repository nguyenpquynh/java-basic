package bai_tap;
import java.util.*;
import java.util.Scanner;

public class bai_tap_buoi2 {
    public static void main(String args[]) {
    //bài tập 1: kt sv có đậu môn khi điểm tb > 5 và ko nghỉ quá 3 buổi

        //Input: điểm , số buổi nghỉ, điểm tb
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem TB: ");
        double diemTB=sc.nextDouble();

        System.out.print("So ngày nghi: ");
        int soNgayNghi=sc.nextInt();

        //Process: kiểm tra dk
        Boolean pass = diemTB >= 5.0 && soNgayNghi <=3;

        //output: in kết quả
        System.out.print("Pass hay Fail: " + pass);

    //BÀI TẬP 2: kt customer có dc giảm giá ko
        //DK là sv hoặc tổng đơn hàng > 500.000đ

        //Input
        System.out.print("\nSinh vien: ");
        Boolean isSinhVien =   sc.nextBoolean(); //Nhập True/false

        System.out.print("Nhap Tổng giá trị đơn hàng: ");
        double tongDH=sc.nextDouble();

        //Process
        Boolean giamGia = isSinhVien || tongDH > 500000;

        //output
        System.out.print("Đc giảm giá / không được: " + giamGia);


    }
}
