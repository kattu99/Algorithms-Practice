/*Job Sequencing */

bool comparison(Job a, Job b) 
{ 
     return (a.profit > b.profit); 
} 

public void printJob(Job arr[], int n) {

    sort(arr, arr+n, comparison);
    int result[n];
    bool slot[n];

    for (int i=0; i<n; i++) {
        slot[i] = false; 
    }

    for (int i=0; i<n; i++) {
        for (int j=0; j<n; j++) {
            if (slot[j] == false) {
                result[j] = i;
                slot[j] = true;
                break;
            }
        }
    }

    for (int i=0; i<n; i++) {
        if (slot[i]) {
            cout<<arr[result[i]].id << " ";
        }
    }
}