class MyHashMap {
    int[] arr = new int[1000001]; 
    
    public MyHashMap() {
        // You MUST fill the array with -1 at the start
        java.util.Arrays.fill(arr, -1);
    }
    
    public void put(int key, int value) {
        arr[key] = value;
    }
    
    public int get(int key) {
        // Now you just return the value directly
        return arr[key];
    }
    
    public void remove(int key) {
        arr[key] = -1;
    }
}
