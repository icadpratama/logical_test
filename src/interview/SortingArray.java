package interview;

public class SortingArray {
    public static void sort(int arr[]){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            int minIdx = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static int maxNumber(int arr[]){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static int minNumber(int arr[]) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main (String[] args) {
        int arr[] = {64,25,12,22,11,12};
        sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
        System.out.println("Max value: " + maxNumber(arr));
        System.out.println("min value: " + minNumber(arr));
    }
}
