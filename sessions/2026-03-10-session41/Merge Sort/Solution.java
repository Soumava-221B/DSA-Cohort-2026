class Solution {
    void mergeSort(int arr[], int l, int r) {
        if(l >= r) return;

        int mid = (l+r)/2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
    }
    void merge (int arr[], int l, int mid, int r) {
        int num1 = mid - l + 1;
        int num2 = r - mid;

        int left[] = new int [num1];
        int right[] = new int [num2];

        for (int i = 0; i < num1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < num2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = l;
        while (i < num1 && j < num2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < num1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < num2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}