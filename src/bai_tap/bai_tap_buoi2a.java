package bai_tap;

import java.util.Scanner;

public class bai_tap_buoi2a {
    public static void main(String[] args) {
        //ví dụ: Xếp loại học sinh dựa trên điểm tb
        //dtb < 5.0: HS yếu
        //5.0 <= dtb < .07: Tb
        //7.0 <= dtb < 8.5: Khá
        //8.5 <= dtb <= 10: giỏi
        //Cho nhập điểm 3 môn: toán, văn, anh, và họ tên

        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Ten sv: ");
        String tenSV = sc.nextLine();

        System.out.println("Diem toan: ");
        Double diemTOan = sc.nextDouble();

        System.out.println("Diem ly: ");
        Double diemLy = sc.nextDouble();

        System.out.println("Diem Hoa: ");
        Double  diemHoa = sc.nextDouble();

        //Process
        Double diemTB = (diemTOan + diemLy + diemHoa) / 3;
        String xepLoai = "";
        if(diemTB <= 5){
            xepLoai ="YEU";
            if (diemTB > 5 && diemTB <= 7){
                xepLoai ="Trung Binh";
            }
            else if(diemTB > 7 && diemTB <= 8.5){
                xepLoai ="kha";
            }
            else {
                xepLoai ="GIOI";
            }
        }

        //Output
        System.out.println("Ten sv: " + tenSV + " xep loai: " + xepLoai);
    }
}
