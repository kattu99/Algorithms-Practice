public class IndexOfFirstOne {

    int answer; 

    public IndexOfFirstOne(int arr[], int low, int high) {

        while (low <= high) {
            int mid = (low + high)/2;

            if (arr[mid] == 1 && (mid == 0 || arr[mid-1] == 0)) {
                return mid; 
            }
            else if (arr[mid] == 1) {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}