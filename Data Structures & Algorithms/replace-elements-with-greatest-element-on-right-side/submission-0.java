class Solution {
    public int[] replaceElements(int[] arr) {
        int ch = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--){
            if(ch > arr[i]) arr[i] = ch;
            else {
                int tem = arr[i];
                arr[i] = ch;
                ch = tem;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}