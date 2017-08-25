import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by WZW on 2017/08/01.
 */
public class QuChong {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {

            int n = in.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = in.nextInt();
            }
            int carray[] = new int[n];
            int index = 0;
            for (int i = 0; i < n; i++) {
                boolean flag = true;
                for (int j = 0; j < index; j++) {
                    if (carray[j] == array[i]) {
                        flag = false;
                    }
                }
                if (flag) {
                    carray[index++] = array[i];
                }
            }
            Arrays.sort(carray, 0, index);
            for (int i = 0; i < index; i++) {
                System.out.println(carray[i]);
            }
        }
    }
}
