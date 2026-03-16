package bai_tap;

import java.util.Scanner;

public class tinh_tien_dien {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu: ");
        Double soDien  = input.nextDouble();
        Double giaDien  = 0.00;

        //process

        if(soDien <= 50){
            giaDien = soDien * 1000.00;
        }
        else if(soDien > 50 && soDien <= 100){
            giaDien = soDien * 1200.00;
        }
        else {
            giaDien = soDien * 1500.00;
        }

        //output
        System.out.println("Gia dien la: " + giaDien);
    }
}
