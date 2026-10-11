
class Solution {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;

        // Step 1: Find the pivot
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no pivot exists, reverse the whole array
        if (index == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element
        for (int i = n - 1; i >= index; i--) {
            if (arr[i] > arr[index]) {
                swap(arr, index, i);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(arr, index + 1, n - 1);
    }
}
