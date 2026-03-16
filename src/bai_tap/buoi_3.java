
package bai_tap;

public class buoi_3 {
    public static void main(String[] args) {
        int soA = 10;
        int soB = 20;
        //array mảng la cấu trúc dữ liệu dung để lưu trữ nhiêu giá trị cung kiểu dữ liệu
        int[] mangso = new int[5];
        mangso[0] = 10;
        mangso[1] = 3;
        mangso[2] = 4;
        mangso[3] = 5;
        mangso[4] = 5;

        System.out.println("Giá trị phân tử index 0: " + mangso[4]);

        //khai báo mảng: kiểu dữ liệu []: tenMang = {gia trị 1, giá trị 2, giá trị 3......}
        String[] mangten = {"Trịnh", "Thanh", "Binh", "Bông", "bụp"};
        mangten[0] = "Nguyen Bao";
        System.out.println("Giá trị phân tử có index=0: " + mangten[0]);
        System.out.println("Số lượng phần tử của mảng: " + mangten.length);

        //duyet mang: sử dụng vòng lập for
        for(int i = 0; i < mangten.length ; i++){
            System.out.println("Phan tu có index " + i + " la: " + mangten[i]);
        }

        //for ... each
        //cú pháp: for kiểu dữ liệu tên biến: tenMang =>Logic sử dụng tên biến
        for (String ten: mangten){
            System.out.println("Tên học sinh: " + ten);
        }

    }
}