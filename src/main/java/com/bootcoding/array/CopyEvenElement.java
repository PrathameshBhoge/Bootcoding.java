package main.java.com.bootcoding.array;

public class CopyEvenElement {
    public static void main(String[] args) {
        int[] arr = {10, 23, 33, 49, 50};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int index=0;
        int[] arr2 = new int[count];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                arr2[index++] = arr[j];
            }
        }

        for(int k = 0;k<count;k++){
            System.out.print(arr2[k]+" ");
        }
    }
}