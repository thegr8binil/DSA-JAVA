import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Sorting {

    public static int[] bubbleSort(int[] nums){
        int temp;
        for(int i=0; i<nums.length;i++){
            for(int j=0; j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the array");
        for(int i =0; i<size;i++){
            nums[i] = sc.nextInt();
        }
        int[] sortedArray = bubbleSort(nums);
        System.out.println("Sorted Array");
        for(int i =0; i<sortedArray.length;i++){
            System.out.print(sortedArray[i]+" ");
        }
    }
}
