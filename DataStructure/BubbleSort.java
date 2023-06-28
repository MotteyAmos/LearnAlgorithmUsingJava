import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] arg){
        int arr[] = {5,1,4,2,8};
        int length = arr.length;

        for (int i=0;i<length;i++){
            for (int j=1;j<length-i; j++){
                if (arr[j-1] > arr[j] ){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
