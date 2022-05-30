package ArraysExercise;

import java.util.Scanner;

public class F06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int[] array = new int[arr.length];
        int leftSum=0;
        int rightSum=0;
        int index=0;
        boolean isValid = false;
        for (int i = 0; i < array.length; i++) {
            array[i]=Integer.parseInt(arr[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                rightSum+=array[j];
            }
            for (int j = i-1; j >= 0; j--) {
                leftSum+=array[j];
            }
            if (leftSum==rightSum){
                index=i;
                isValid=true;
            }
            rightSum=0;
            leftSum=0;
        }
        if (isValid){
            System.out.println(index);
        }else{
            System.out.println("no");
        }
    }
}
