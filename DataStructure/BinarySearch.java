public class BinarySearch {
    public static void main(String[] arg){

    }

    public static void binarySearch(int[] dataList,int value){
        int lower = 0;
        int upper = dataList.length -1;

        while (lower <= upper){
            int mid = (lower + upper) / 2;

            if (dataList[mid] == value){
                return (value, mid);
            }

        }
    }
}
