/**
 * Created by WZW on 2017/08/01.
 */
public class BigNumberMulti {
    public static void main(String[] args) {
        String num1Str = "12385674934";
        String num2Str = "1234354566";
        int[] num1 = new int[num1Str.length()];
        int[] num2 = new int[num2Str.length()];
        //将字符串转换为整数数组，注意，24566应转化成{6,6,5,4,2}
        for(int i = 0; i < num1Str.length();i++) {
            num1[num1Str.length() -1- i] = num1Str.charAt(i)-'0';
        }
        for(int i = 0; i < num2Str.length();i++) {
            num2[num2Str.length() -1- i] = num2Str.charAt(i)-'0';
        }
        int[] result = multiply(num1, num2);
        for(int i = result.length-1; i>=0;i--){
            if(result[i]!=0)
                 System.out.print(result[i]);
        }
    }

    public static int[] multiply(int[] num1, int[] num2) {
        int lengthOfNum1 = num1.length;
        int lengthOfNum2 = num2.length;
        // 分配一个空间，用来存储运算的结果，n1长的数* n2长的数，结果不会超过n1+n2长
        int[] result = new int[lengthOfNum1 + lengthOfNum2];
        // 先不考虑进位问题，根据小学竖式的乘法运算，n1的第i位与n2的第j位相乘，结果应该存放在结果的第i+j位上
        for (int i = 0; i < lengthOfNum1; i++) {
            for (int j = 0; j < lengthOfNum2; j++) {
                result[i + j] += num1[i] * num2[j];
            }
        }
        // 单独处理进位问题
        for (int i = 0; i < lengthOfNum1 + lengthOfNum2 -1; i++) {
            if (result[i] > 10) {
                result[i + 1] += result[i] / 10;
                result[i] %= 10;
            }
        }
        return result;

    }
}