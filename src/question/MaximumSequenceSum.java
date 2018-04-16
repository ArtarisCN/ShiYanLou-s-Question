package question;

/**
 *
 输入一组整数，求出这组数字子序列和中的最大值，只要求出最大子序列的和，不必求出最大值对应的序列。

 最大子序列和：整数序列A1， A2，... An （可能有负数），求A1~An的一个子序列Ai~Aj，使得Ai到Aj的和最大。
 例如：

 序列：-2, 11, -4, 13, -5, 2, -5, -3, 12, -9，则最大子序列和为21。

 序列：0, -3, 6, 8, -20, 21, 8, -9, 10, -1, 3, 6, 5，则最大子序列和为43。

 * Created by rick on 2018/4/12.
 */



public class MaximumSequenceSum {

    public static int maximumSequenceSum(int[] array){

        int sum = 0,tempSum = 0;

        for (int i = 0; i < array.length; i++) {

            tempSum += array[i];

            if(tempSum > sum){
                sum = tempSum;

            } else if(tempSum < 0){
                tempSum = 0;
            }
        }

        if(sum == 0){
            int maxValue = array[0];

            for (int i : array) {
                if(i > maxValue){
                    maxValue = i;
                }
            }

            sum = maxValue;
        }

        return sum;
    }

}