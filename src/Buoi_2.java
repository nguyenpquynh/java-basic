import java.util.Scanner;

public class Buoi_2 {
    public static void main(String args[]) {
        //4.3 toán tử gán: "=", +=, -=, *=, -=
        String ngay = "thứ 2: 09.3.2026";
        int soA = 10;
        soA += 5; //soA = soA + 5
        System.out.println(soA);
        soA -= 3; //soA = soA - 3
        System.out.println(soA);
        soA *= 2; //soA = soA * 2
        System.out.println(soA);
        soA /= 4; //soA = soA / 4
        System.out.println(soA);


        ///4.4 toán tử logic: &&, ??, !: sử dụng những biến kiểu boolean
        // &&: kết hợp tất cả các điều kiện của các logic
        Boolean logicA = true;
        Boolean logicB = true;
        Boolean logicC = false;
        Boolean ketQua1 = logicA && logicB && logicC;
        System.out.println("KQ 1: " + ketQua1);


        // ||: hoặc > hoặc logicA hoặc logicB hoạc LogicC
        Boolean logicD = false;
        Boolean logicE = false;
        Boolean logicF = true;
        Boolean ketQua2 = logicD || logicE || logicF;
        System.out.println("KQ 2:  "+ketQua2);

        // !: phủ định: Đảo ngược giá trị của biến logic
        Boolean logicG = true;
        Boolean KetQua3 = !logicG;
        System.out.println("KQ 3:  "+KetQua3);


        //Cấu trúc dk
        //if statement:
        //if(dk đúng) => thực hiện logic
        int thu = 2;
        if(thu == 2 || thu == 6){
            System.out.println("Hôm nay phải đi học");
        }

        // if else statement
        int soBuoiNghi = 4;
        float dtb = 8;
        Boolean isQuaMon = dtb >= 5.0 && soBuoiNghi <= 6;
        if (isQuaMon) {
            System.out.println("Sv pass");
        }
        else {
            System.out.println("SV fail");
        }
        }

        //if else if statement:
        //if (dk a đúng) {logic A} else if (dk B đúng) logicB else {logic C}
}
