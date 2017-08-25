import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class Main {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {

            String s = in.nextLine();
            char[] c = s.toCharArray();
            int x = 0;
            int count = 0;
            for (int i = c.length - 1; i >= 2; i--) {
                int temp = 1;
                for (int j = 0; j < count; j++) {
                    temp *= 16;
                }
                x += temp * getNum(c[i]);
                count++;
            }
            System.out.println(x);
        }
    }
    public static int getNum(char c){
        switch(c){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
            case 'A':return 10;
            case 'B':return 11;
            case 'C':return 12;
            case 'D':return 13;
            case 'E':return 14;
            case 'F':return 15;
            default:return 0;
        }
    }
}
