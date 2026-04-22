class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;

        // 1. Build the Heap (Rearrange array)
        // Start from the last non-leaf node and heapify down to the root
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        // 2. Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root (largest) to the end of the array
            swap(nums, 0, i);

            // Call heapify on the reduced heap to restore order
            heapify(nums, i, 0);
        }
        
        return nums;
    }

    /**
     * Maintains the heap property. 
     * @param n size of the heap
     * @param i the index to "sift down"
     */
    private void heapify(int[] nums, int n, int i) {
        int l = i;
        int le = 2 * i + 1;
        int r = 2*  i + 2;

        if(le < n && nums[l] < nums[le]){
            l = le;
        }

        if(r < n && nums[l] < nums[r]){
            l = r;
        }

        if(l != i){
            int tem = nums[i];
            nums[i] = nums[l];
            nums[l] = tem;
            
            heapify(nums, n , l);
        }
    }

    /**
     * Helper method to swap two elements in the array
     */
    private void swap(int[] nums, int i, int j) {
       int tem = nums[i];
       nums[i] = nums[j];
       nums[j] = tem;
    }
}
