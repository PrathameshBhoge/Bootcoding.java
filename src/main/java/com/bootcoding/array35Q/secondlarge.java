package main.java.com.bootcoding.array35Q;

public class secondlarge {
    public static void main(String[] args) {
        int [] arr={20,50,30,66,70,25};
        System.out.println(SecLarge(arr));
    }

    public static int SecLarge(int [] arr){
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=arr[j];
                }

            }

        }
        return temp;

    }
}
