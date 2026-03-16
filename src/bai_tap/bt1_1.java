package bai_tap;

import java.util.Scanner;

public class bt1_1 {
    public static String deleteChar(String strOfCha){
        Scanner sc = new Scanner(System.in);
        String strResult = "";
        for (int i=0; i<strOfCha.length(); i++){
            char ch = strOfCha.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
               ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'){
                strResult += ch;
            }
        }
        return strResult;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter one word: ");
        String word = sc.nextLine();
        String wordOutput = deleteChar(word);
        System.out.println("Word Out Put: " + wordOutput);
    }
}
