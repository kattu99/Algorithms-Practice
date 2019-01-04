public class ElementAppearsOnce {


    public static void search(int[] arr, int low, int high) {

        if (low>high)
            return;
        if (low == high) {
            System.out.println("The required element is "+ arr[low]);
            return;
        }

        int mid = (low + high)/2;

        if (mid % 2 == 0) {
            if (arr[mid] == arr[mid+1]) {
                search(arr, mid+2, high);
            }
            else {
                search(arr,low,mid);
            }
        }
        else if(mid%2 == 1) {
            if (arr[mid] == arr[mid-1]) {
                search(arr, mid+1, high);
            }
            else {
                search(arr, low, mid-1);
            }
        }
    }
}