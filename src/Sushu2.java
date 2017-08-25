/**
 * Created by WZW on 2017/08/07.
 */
import java.util.Collections;
import java.util.Scanner;
public class Sushu2 {
    public static void main(String[] args) {
        int n;
        int m;
        int count=0;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNextInt()) {
            m = cin.nextInt();
            n=cin.nextInt();
            int[] array = new int[n];
            for (int i = 2; i < n; i++) {
                array[i] = i;
            }
            for (int i = 2; i < n; i++) {
                if (array[i] != 0) {
                    int j, temp;
                    temp = array[i];
                    for (j = 2 * temp; j < n; j = j + temp) {
                        array[j] = 0;
                    }
                    if(i>=m) {
                        count++;
                    }
                    int a[]={2,23,15,12};

                }
            }
            System.out.println(count);
        }
    }
}